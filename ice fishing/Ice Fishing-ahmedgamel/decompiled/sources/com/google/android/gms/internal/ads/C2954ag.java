package com.google.android.gms.internal.ads;

import A1.AbstractC0269k;
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
import q2.C4870b;
import r2.C4900e;
import r2.C4902g;
import r2.C4906k;
import v2.BinderC5100d;

/* renamed from: com.google.android.gms.internal.ads.ag, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2954ag extends AbstractC0269k {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29843v = 2;

    /* renamed from: w, reason: collision with root package name */
    public final Object f29844w;

    public C2954ag(Context context) {
        super(4);
        this.f29844w = context;
    }

    @Override // A1.AbstractC0269k
    public final void k() {
        BitmapDrawable bitmapDrawable;
        boolean z6 = false;
        switch (this.f29843v) {
            case 0:
                C3061cg c3061cg = (C3061cg) this.f29844w;
                C2590Gf c2590Gf = new C2590Gf(c3061cg.f30306e, c3061cg.f30307f.f41845n);
                synchronized (c3061cg.f30302a) {
                    try {
                        V2 v22 = C4906k.f40186C.f40200m;
                        V2.q(c3061cg.f30309h, c2590Gf);
                    } catch (IllegalArgumentException e9) {
                        int i = w2.z.f41712b;
                        x2.i.g("Cannot config CSI reporter.", e9);
                    }
                }
                return;
            case 1:
                C4900e c4900e = C4906k.f40186C.f40210w;
                BinderC5100d binderC5100d = (BinderC5100d) this.f29844w;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) c4900e.f40152n).get(Integer.valueOf(binderC5100d.f41115v.f24349H.f40176y));
                if (bitmap != null) {
                    C4902g c4902g = binderC5100d.f41115v.f24349H;
                    boolean z9 = c4902g.f40174w;
                    Activity activity = binderC5100d.f41114u;
                    if (z9) {
                        float f2 = c4902g.f40175x;
                        if (f2 > 0.0f && f2 <= 25.0f) {
                            try {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                                RenderScript create = RenderScript.create(activity);
                                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                                Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                                create2.setRadius(f2);
                                create2.setInput(createFromBitmap);
                                create2.forEach(createFromBitmap2);
                                createFromBitmap2.copyTo(createBitmap);
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                            } catch (RuntimeException unused) {
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                            }
                            w2.D.f41627l.post(new RunnableC3214fP(20, this, bitmapDrawable));
                            return;
                        }
                    }
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    w2.D.f41627l.post(new RunnableC3214fP(20, this, bitmapDrawable));
                    return;
                }
                return;
            default:
                try {
                    z6 = C4870b.b((Context) this.f29844w);
                } catch (O2.g | IOException | IllegalStateException e10) {
                    int i4 = w2.z.f41712b;
                    x2.i.d("Fail to get isAdIdFakeForDebugLogging", e10);
                }
                synchronized (x2.f.f41859b) {
                    x2.f.f41860c = true;
                    x2.f.f41861d = z6;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(z6).length() + 38);
                sb.append("Update ad debug logging enablement as ");
                sb.append(z6);
                String sb2 = sb.toString();
                int i6 = w2.z.f41712b;
                x2.i.f(sb2);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2954ag(C3061cg c3061cg) {
        super(4);
        Objects.requireNonNull(c3061cg);
        this.f29844w = c3061cg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2954ag(BinderC5100d binderC5100d) {
        super(4);
        Objects.requireNonNull(binderC5100d);
        this.f29844w = binderC5100d;
    }
}
