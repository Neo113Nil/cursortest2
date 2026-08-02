package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class v991 {
    public Object[] a = new Object[4];
    public int b = 0;
    public boolean c;

    public final void a(String str) {
        str.getClass();
        int i = this.b;
        int i2 = i + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr, i3);
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        objArr2[i4] = str;
    }
}
