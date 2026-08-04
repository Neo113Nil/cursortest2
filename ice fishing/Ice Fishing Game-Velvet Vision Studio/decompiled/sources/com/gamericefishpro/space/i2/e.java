package com.gamericefishpro.space.i2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.f.b {
    public static e c;

    @Override // com.gamericefishpro.space.f.b
    public final int[] b(int i) {
        int length = n().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && n().charAt(i) == '\n' && (n().charAt(i) == '\n' || (i != 0 && n().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !y(i2)) {
            i2++;
        }
        return l(i, i2);
    }

    @Override // com.gamericefishpro.space.f.b
    public final int[] x(int i) {
        int length = n().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && n().charAt(i - 1) == '\n' && !y(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (n().charAt(i2) == '\n' || (i2 != 0 && n().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return l(i2, i);
    }

    public final boolean y(int i) {
        if (i <= 0 || n().charAt(i - 1) == '\n') {
            return false;
        }
        return i == n().length() || n().charAt(i) == '\n';
    }
}
