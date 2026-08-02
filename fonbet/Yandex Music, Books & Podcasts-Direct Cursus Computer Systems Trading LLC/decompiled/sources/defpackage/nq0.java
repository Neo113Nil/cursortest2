package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;

/* loaded from: classes.dex */
public final class nq0 {
    public Object a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ nq0(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        mq0 mq0Var = (mq0) this.f;
        Drawable checkMarkDrawable = mq0Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(mq0Var.getDrawableState());
                }
                mq0Var.setCheckMarkDrawable(mutate);
            }
        }
    }

    public o9l c() {
        o9l o9lVar = (o9l) this.a;
        if (o9lVar != null) {
            return o9lVar;
        }
        Intrinsics.j("log");
        throw null;
    }

    public void d() {
        n9l n9lVar = o9l.j;
        this.a = new o9l(this.c ? n9lVar.a : n9lVar.b, new kgk(3, this), new ybg(16, this));
    }

    public void e() {
        this.d = true;
        o9l c = c();
        ScheduledFuture scheduledFuture = c.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        c.h = null;
        o9l c2 = c();
        l9l l9lVar = PlayerAliveState.Companion;
        PlayerState a = ((z2t) this.b).b.a();
        l9lVar.getClass();
        PlayerAliveState a2 = l9l.a(a);
        ArrayList arrayList = c2.g;
        arrayList.add(a2);
        c2.c.invoke(CollectionsKt.w0(arrayList));
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = ken.m;
        lum W = lum.W(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) W.b;
        wdu.p(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) W.b, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(y2x.w(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(W.J(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(xpa.c(typedArray.getInt(3, -1), null));
                }
                W.f0();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(y2x.w(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            W.f0();
        } catch (Throwable th) {
            W.f0();
            throw th;
        }
    }

    public nq0(z2t z2tVar, ScheduledExecutorService scheduledExecutorService) {
        this.b = z2tVar;
        scheduledExecutorService.getClass();
        this.f = scheduledExecutorService;
        this.c = true;
    }
}
