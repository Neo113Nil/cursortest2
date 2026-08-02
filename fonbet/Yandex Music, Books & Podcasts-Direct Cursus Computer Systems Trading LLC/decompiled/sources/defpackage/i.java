package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class i {
    public static final yp7 a = new yp7();

    public static final boolean a(rce rceVar) {
        ilm ilmVar = rceVar.h;
        i6s i6sVar = rceVar.c;
        bnq bnqVar = rceVar.y;
        int ordinal = ilmVar.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                b6e.s();
                return false;
            }
            if (rceVar.E.a != null || !(bnqVar instanceof ha8)) {
                if (!(i6sVar instanceof lhu) || !(bnqVar instanceof aln)) {
                    return false;
                }
                lhu lhuVar = (lhu) i6sVar;
                if (!(lhuVar.getView() instanceof ImageView) || lhuVar.getView() != ((aln) bnqVar).a) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final Drawable b(rce rceVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        Context context = rceVar.a;
        int intValue = num.intValue();
        Drawable w = y2x.w(context, intValue);
        if (w != null) {
            return w;
        }
        wb8.h(k5r.i(intValue, "Invalid resource ID: "));
        return null;
    }
}
