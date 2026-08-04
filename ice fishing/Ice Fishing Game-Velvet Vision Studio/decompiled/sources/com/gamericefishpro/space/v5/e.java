package com.gamericefishpro.space.v5;

import android.database.Cursor;
import com.gamericefishpro.space.tb.u;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    public byte[][] A;
    public Cursor B;
    public int[] v;
    public long[] w;
    public double[] y;
    public String[] z;

    public static void l(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            com.gamericefishpro.space.i.a.Q(25, "column index out of range");
            throw null;
        }
    }

    @Override // com.gamericefishpro.space.c6.c
    public final boolean H() {
        b();
        j();
        Cursor cursor = this.B;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.gamericefishpro.space.c6.c
    public final void a(int i, long j) {
        b();
        c(1, i);
        this.v[i] = 1;
        this.w[i] = j;
    }

    public final void c(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.v;
        if (iArr.length < i3) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.v = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.w;
            if (jArr.length < i3) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i3);
                Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                this.w = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.y;
            if (dArr.length < i3) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i3);
                Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
                this.y = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.z;
            if (strArr.length < i3) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i3);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                this.z = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.A;
        if (bArr.length < i3) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i3);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
            this.A = (byte[][]) objArrCopyOf2;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.i) {
            b();
            this.v = new int[0];
            this.w = new long[0];
            this.y = new double[0];
            this.z = new String[0];
            this.A = new byte[0][];
            reset();
        }
        this.i = true;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final String g(int i) {
        b();
        Cursor cursor = this.B;
        if (cursor == null) {
            com.gamericefishpro.space.i.a.Q(21, "no row");
            throw null;
        }
        l(cursor, i);
        String string = cursor.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final int getColumnCount() {
        b();
        j();
        Cursor cursor = this.B;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final String getColumnName(int i) {
        b();
        j();
        Cursor cursor = this.B;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        l(cursor, i);
        String columnName = cursor.getColumnName(i);
        Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final long getLong(int i) {
        b();
        Cursor cursor = this.B;
        if (cursor != null) {
            l(cursor, i);
            return cursor.getLong(i);
        }
        com.gamericefishpro.space.i.a.Q(21, "no row");
        throw null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final boolean isNull(int i) {
        b();
        Cursor cursor = this.B;
        if (cursor != null) {
            l(cursor, i);
            return cursor.isNull(i);
        }
        com.gamericefishpro.space.i.a.Q(21, "no row");
        throw null;
    }

    public final void j() {
        if (this.B == null) {
            this.B = this.d.f(new u(14, this));
        }
    }

    @Override // com.gamericefishpro.space.c6.c
    public final void reset() {
        b();
        Cursor cursor = this.B;
        if (cursor != null) {
            cursor.close();
        }
        this.B = null;
    }

    @Override // com.gamericefishpro.space.c6.c
    public final void u(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        b();
        c(3, i);
        this.v[i] = 3;
        this.z[i] = value;
    }
}
