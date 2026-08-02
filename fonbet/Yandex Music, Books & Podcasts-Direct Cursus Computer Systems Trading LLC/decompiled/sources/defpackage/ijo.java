package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ijo {
    public ynv a;
    public ArrayList b;

    public static long a(sx7 sx7Var, long j) {
        ynv ynvVar = sx7Var.d;
        ArrayList arrayList = sx7Var.k;
        if (ynvVar instanceof exd) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            px7 px7Var = (px7) arrayList.get(i);
            if (px7Var instanceof sx7) {
                sx7 sx7Var2 = (sx7) px7Var;
                if (sx7Var2.d != ynvVar) {
                    j2 = Math.min(j2, a(sx7Var2, sx7Var2.f + j));
                }
            }
        }
        sx7 sx7Var3 = ynvVar.i;
        sx7 sx7Var4 = ynvVar.h;
        if (sx7Var != sx7Var3) {
            return j2;
        }
        long j3 = j - ynvVar.j();
        return Math.min(Math.min(j2, a(sx7Var4, j3)), j3 - sx7Var4.f);
    }

    public static long b(sx7 sx7Var, long j) {
        ynv ynvVar = sx7Var.d;
        ArrayList arrayList = sx7Var.k;
        if (ynvVar instanceof exd) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            px7 px7Var = (px7) arrayList.get(i);
            if (px7Var instanceof sx7) {
                sx7 sx7Var2 = (sx7) px7Var;
                if (sx7Var2.d != ynvVar) {
                    j2 = Math.max(j2, b(sx7Var2, sx7Var2.f + j));
                }
            }
        }
        sx7 sx7Var3 = ynvVar.h;
        sx7 sx7Var4 = ynvVar.i;
        if (sx7Var != sx7Var3) {
            return j2;
        }
        long j3 = ynvVar.j() + j;
        return Math.max(Math.max(j2, b(sx7Var4, j3)), j3 - sx7Var4.f);
    }
}
