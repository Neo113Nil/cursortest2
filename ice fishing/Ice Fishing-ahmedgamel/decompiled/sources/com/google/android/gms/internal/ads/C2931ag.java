package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import o2.C4784b;
import p2.C4831f;
import p2.C4835j;
import t0.C4988C;
import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.ag, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2931ag extends L3.o {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29068v = 2;

    /* renamed from: w, reason: collision with root package name */
    public final Object f29069w;

    public C2931ag(Context context) {
        super(3);
        this.f29069w = context;
    }

    @Override // L3.o
    public final void k() {
        BitmapDrawable bitmapDrawable;
        boolean z3 = false;
        switch (this.f29068v) {
            case 0:
                C3038cg c3038cg = (C3038cg) this.f29069w;
                C2570Gf c2570Gf = new C2570Gf(c3038cg.f29521e, c3038cg.f29522f.f41391n);
                synchronized (c3038cg.f29517a) {
                    try {
                        V2 v22 = C4835j.f39733C.f39747m;
                        V2.q(c3038cg.f29524h, c2570Gf);
                    } catch (IllegalArgumentException e9) {
                        int i = u2.z.f41322b;
                        v2.i.g("Cannot config CSI reporter.", e9);
                    }
                }
                return;
            case 1:
                C4988C c4988c = C4835j.f39733C.f39757w;
                BinderC5036d binderC5036d = (BinderC5036d) this.f29069w;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) c4988c.f40535u).get(Integer.valueOf(binderC5036d.f40827v.f23569H.f39723y));
                if (bitmap != null) {
                    C4831f c4831f = binderC5036d.f40827v.f23569H;
                    boolean z6 = c4831f.f39721w;
                    Activity activity = binderC5036d.f40826u;
                    if (z6) {
                        float f3 = c4831f.f39722x;
                        if (f3 > 0.0f && f3 <= 25.0f) {
                            try {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                                RenderScript create = RenderScript.create(activity);
                                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                                Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                                create2.setRadius(f3);
                                create2.setInput(createFromBitmap);
                                create2.forEach(createFromBitmap2);
                                createFromBitmap2.copyTo(createBitmap);
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                            } catch (RuntimeException unused) {
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                            }
                            u2.D.f41237l.post(new RunnableC3191fP(20, this, bitmapDrawable));
                            return;
                        }
                    }
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    u2.D.f41237l.post(new RunnableC3191fP(20, this, bitmapDrawable));
                    return;
                }
                return;
            default:
                try {
                    z3 = C4784b.b((Context) this.f29069w);
                } catch (M2.g | IOException | IllegalStateException e10) {
                    int i6 = u2.z.f41322b;
                    v2.i.d("Fail to get isAdIdFakeForDebugLogging", e10);
                }
                synchronized (v2.f.f41405b) {
                    v2.f.f41406c = true;
                    v2.f.f41407d = z3;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(z3).length() + 38);
                sb.append("Update ad debug logging enablement as ");
                sb.append(z3);
                String sb2 = sb.toString();
                int i9 = u2.z.f41322b;
                v2.i.f(sb2);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2931ag(C3038cg c3038cg) {
        super(3);
        Objects.requireNonNull(c3038cg);
        this.f29069w = c3038cg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2931ag(BinderC5036d binderC5036d) {
        super(3);
        Objects.requireNonNull(binderC5036d);
        this.f29069w = binderC5036d;
    }
}
