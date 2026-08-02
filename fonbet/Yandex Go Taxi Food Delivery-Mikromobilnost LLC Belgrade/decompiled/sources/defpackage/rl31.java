package defpackage;

import android.util.Range;

/* loaded from: classes10.dex */
public interface rl31 {
    Range B0(int i);

    int Hc();

    default boolean M1(int i, int i2) {
        if (Nb(i, i2)) {
            return true;
        }
        return p6() && Nb(i2, i);
    }

    Range N3(int i);

    boolean Nb(int i, int i2);

    Range Q2();

    int a8();

    boolean p6();

    Range q4();

    Range s5();
}
