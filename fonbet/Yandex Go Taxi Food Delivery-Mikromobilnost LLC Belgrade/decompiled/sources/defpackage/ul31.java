package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class ul31 implements rl31 {
    public final rl31 a;
    public final Range b;
    public final Range c;
    public final HashSet w;

    public ul31(rl31 rl31Var) {
        HashSet hashSet = new HashSet();
        this.w = hashSet;
        this.a = rl31Var;
        int Hc = rl31Var.Hc();
        this.b = Range.create(Integer.valueOf(Hc), Integer.valueOf(((int) Math.ceil(4096.0d / Hc)) * Hc));
        int a8 = rl31Var.a8();
        this.c = Range.create(Integer.valueOf(a8), Integer.valueOf(((int) Math.ceil(2160.0d / a8)) * a8));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static rl31 a(rl31 rl31Var, Size size) {
        if (!(rl31Var instanceof ul31)) {
            if (vbj.a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !rl31Var.M1(size.getWidth(), size.getHeight())) {
                    Range q4 = rl31Var.q4();
                    Range s5 = rl31Var.s5();
                    size.toString();
                    Objects.toString(q4);
                    Objects.toString(s5);
                    sgb1.g(5, "VideoEncoderInfoWrapper");
                }
            }
            rl31Var = new ul31(rl31Var);
        }
        if (size != null && (rl31Var instanceof ul31)) {
            ((ul31) rl31Var).w.add(size);
        }
        return rl31Var;
    }

    @Override // defpackage.rl31
    public final Range B0(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean contains = range.contains((Range) valueOf);
        rl31 rl31Var = this.a;
        d6z.m("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + rl31Var.a8(), contains && i % rl31Var.a8() == 0);
        return this.b;
    }

    @Override // defpackage.rl31
    public final int Hc() {
        return this.a.Hc();
    }

    @Override // defpackage.rl31
    public final Range N3(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean contains = range.contains((Range) valueOf);
        rl31 rl31Var = this.a;
        d6z.m("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + rl31Var.Hc(), contains && i % rl31Var.Hc() == 0);
        return this.c;
    }

    @Override // defpackage.rl31
    public final boolean Nb(int i, int i2) {
        rl31 rl31Var = this.a;
        if (rl31Var.Nb(i, i2)) {
            return true;
        }
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        return this.b.contains((Range) Integer.valueOf(i)) && this.c.contains((Range) Integer.valueOf(i2)) && i % rl31Var.Hc() == 0 && i2 % rl31Var.a8() == 0;
    }

    @Override // defpackage.rl31
    public final Range Q2() {
        return this.a.Q2();
    }

    @Override // defpackage.rl31
    public final int a8() {
        return this.a.a8();
    }

    @Override // defpackage.rl31
    public final boolean p6() {
        return this.a.p6();
    }

    @Override // defpackage.rl31
    public final Range q4() {
        return this.b;
    }

    @Override // defpackage.rl31
    public final Range s5() {
        return this.c;
    }
}
