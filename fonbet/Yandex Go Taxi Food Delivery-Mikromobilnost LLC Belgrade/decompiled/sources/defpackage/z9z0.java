package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.yandex.messaging.internal.view.timeline.DialogItemDrawable;
import com.yandex.messaging.internal.view.timeline.DialogItemStaticDrawable;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class z9z0 {
    public final Activity a;
    public final aaz0 b;
    public final Resources c;
    public final DialogItemStaticDrawable d;
    public final Drawable e;
    public final Drawable f;
    public final y9z0 g;
    public final y9z0 h;
    public final y9z0 i;
    public final y9z0 j;
    public final y9z0 k;
    public final y9z0 l;
    public final y9z0 m;
    public final y9z0 n;
    public final y9z0 o;
    public final y9z0 p;
    public final HashMap q;

    public z9z0(Activity activity, aaz0 aaz0Var) {
        this.a = activity;
        this.b = aaz0Var;
        Resources resources = activity.getResources();
        this.c = resources;
        HashMap hashMap = new HashMap();
        this.q = hashMap;
        int i = fxa1.c(jng0.messagingOutgoingBackgroundColor, activity).data;
        int i2 = fxa1.c(jng0.messagingCommonAccentLineColor, activity).data;
        int i3 = fxa1.c(jng0.messagingIncomingBackgroundColor, activity).data;
        int i4 = fxa1.c(jng0.messagingCommonBackgroundColor, activity).data;
        this.g = new y9z0(this, 528, i, 0);
        this.h = new y9z0(this, 528, i, i2);
        this.i = new y9z0(this, 544, i, 0);
        this.j = new y9z0(this, 544, i, i2);
        this.k = new y9z0(this, 4098, i3, 0);
        this.l = new y9z0(this, 4098, i3, i2);
        this.m = new y9z0(this, 8194, i3, 0);
        this.n = new y9z0(this, 8194, i3, i2);
        this.d = new DialogItemStaticDrawable(resources, 12834, i4, 0);
        this.o = new y9z0(this, 13090, i4, 0);
        this.p = new y9z0(this, 8994, i4, 0);
        Drawable drawable = activity.getDrawable(wwg0.msg_bg_chat_actions);
        if (drawable == null) {
            ny61.t("resource not found");
            throw null;
        }
        this.e = drawable;
        Drawable drawable2 = activity.getDrawable(wwg0.msg_bg_chat_actions_group);
        if (drawable2 == null) {
            ny61.t("resource not found");
            throw null;
        }
        this.f = drawable2;
        z83.h(null, hashMap.isEmpty());
        hashMap.clear();
    }

    public static Drawable b(z9z0 z9z0Var, Context context, int[] iArr) {
        z9z0Var.getClass();
        String arrays = Arrays.toString(iArr);
        HashMap hashMap = z9z0Var.q;
        y9z0 y9z0Var = (y9z0) hashMap.get(arrays);
        if (y9z0Var != null) {
            return y9z0Var.a(false);
        }
        int i = fxa1.c(jng0.messagingCommonBackgroundColor, context).data;
        DialogItemDrawable.Companion.getClass();
        z83.i();
        int i2 = iArr[3];
        for (int i3 = 2; -1 < i3; i3--) {
            i2 = (i2 << 4) + iArr[i3];
        }
        y9z0 y9z0Var2 = new y9z0(z9z0Var, i2, i, 0);
        hashMap.put(arrays, y9z0Var2);
        return y9z0Var2.a(false);
    }

    public final Drawable a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return (z3 ? z ? z4 ? this.h : this.g : z4 ? this.j : this.i : z2 ? z4 ? this.l : this.k : z4 ? this.n : this.m).a(z5);
    }
}
