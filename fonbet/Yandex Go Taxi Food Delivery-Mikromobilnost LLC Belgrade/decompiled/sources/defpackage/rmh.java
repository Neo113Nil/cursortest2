package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.z;

/* loaded from: classes10.dex */
public final class rmh extends tmh implements Comparable {
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final int x;
    public final boolean y;
    public final boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public rmh(int i, xzz0 xzz0Var, int i2, omh omhVar, int i3, String str, String str2) {
        super(i, xzz0Var, i2);
        int i4;
        int i5 = 0;
        this.y = iyi0.e(i3, false);
        int i6 = this.w.e;
        int i7 = omhVar.r;
        ImmutableList immutableList = omhVar.p;
        int i8 = i6 & (~i7);
        this.z = (i8 & 1) != 0;
        this.A = (i8 & 2) != 0;
        ImmutableList r = str2 != null ? ImmutableList.r(str2) : immutableList.isEmpty() ? ImmutableList.r("") : immutableList;
        int i9 = 0;
        while (true) {
            if (i9 >= r.size()) {
                i9 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            } else {
                i4 = vmh.getFormatLanguageScore(this.w, (String) r.get(i9), false);
                if (i4 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.B = i9;
        this.C = i4;
        int access$4200 = vmh.access$4200(this.w.f, str2 != null ? 1088 : 0);
        this.D = access$4200;
        this.F = (1088 & this.w.f) != 0;
        int formatLanguageScore = vmh.getFormatLanguageScore(this.w, str, vmh.normalizeUndeterminedLanguageToNull(str) == null);
        this.E = formatLanguageScore;
        boolean z = i4 > 0 || (immutableList.isEmpty() && access$4200 > 0) || this.z || (this.A && formatLanguageScore > 0);
        if (iyi0.e(i3, omhVar.B) && z) {
            i5 = 1;
        }
        this.x = i5;
    }

    @Override // defpackage.tmh
    public final int a() {
        return this.x;
    }

    @Override // defpackage.tmh
    public final /* bridge */ /* synthetic */ boolean b(tmh tmhVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rmh rmhVar) {
        jvc b = jvc.a.c(this.y, rmhVar.y).b(Integer.valueOf(this.B), Integer.valueOf(rmhVar.B), z.c().g());
        int i = rmhVar.C;
        int i2 = this.C;
        jvc a = b.a(i2, i);
        int i3 = rmhVar.D;
        int i4 = this.D;
        jvc a2 = a.a(i4, i3).c(this.z, rmhVar.z).b(Boolean.valueOf(this.A), Boolean.valueOf(rmhVar.A), i2 == 0 ? z.c() : z.c().g()).a(this.E, rmhVar.E);
        if (i4 == 0) {
            a2 = a2.d(this.F, rmhVar.F);
        }
        return a2.e();
    }
}
