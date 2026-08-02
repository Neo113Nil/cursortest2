package defpackage;

/* loaded from: classes.dex */
public final class g13 implements cko {
    public final /* synthetic */ int a;
    public final cko b;

    public g13(cko ckoVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ckoVar;
                break;
            default:
                ckoVar.getClass();
                this.b = ckoVar;
                break;
        }
    }

    @Override // defpackage.cko
    public final void E(int i, String str) {
        switch (this.a) {
            case 0:
                str.getClass();
                this.b.E(i, str);
                break;
            default:
                str.getClass();
                this.b.E(i, str);
                break;
        }
    }

    @Override // defpackage.cko
    public final void bindBlob(int i, byte[] bArr) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                this.b.bindBlob(i, bArr);
                break;
            default:
                bArr.getClass();
                this.b.bindBlob(i, bArr);
                break;
        }
    }

    @Override // defpackage.cko
    public final void bindDouble(int i, double d) {
        switch (this.a) {
            case 0:
                this.b.bindDouble(i, d);
                break;
            default:
                this.b.bindDouble(i, d);
                break;
        }
    }

    @Override // defpackage.cko
    public final void bindLong(int i, long j) {
        switch (this.a) {
            case 0:
                this.b.bindLong(i, j);
                break;
            default:
                this.b.bindLong(i, j);
                break;
        }
    }

    @Override // defpackage.cko
    public final void bindNull(int i) {
        switch (this.a) {
            case 0:
                this.b.bindNull(i);
                break;
            default:
                this.b.bindNull(i);
                break;
        }
    }

    @Override // defpackage.cko
    public final void clearBindings() {
        switch (this.a) {
            case 0:
                this.b.clearBindings();
                break;
            default:
                this.b.clearBindings();
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                cko ckoVar = this.b;
                ckoVar.reset();
                ckoVar.clearBindings();
                return;
        }
    }

    @Override // defpackage.cko
    public final byte[] getBlob(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.getBlob(i);
        }
    }

    @Override // defpackage.cko
    public final int getColumnCount() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.getColumnCount();
        }
    }

    @Override // defpackage.cko
    public final String getColumnName(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.getColumnName(i);
        }
    }

    @Override // defpackage.cko
    public final double getDouble(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.getDouble(i);
        }
    }

    @Override // defpackage.cko
    public final long getLong(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.getLong(i);
        }
    }

    @Override // defpackage.cko
    public final boolean isNull(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.isNull(i);
        }
    }

    @Override // defpackage.cko
    public final boolean p0() {
        switch (this.a) {
        }
        return this.b.p0();
    }

    @Override // defpackage.cko
    public final boolean q() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.q();
        }
    }

    @Override // defpackage.cko
    public final void reset() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                this.b.reset();
                return;
        }
    }

    @Override // defpackage.cko
    public final String x0(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.x0(i);
        }
    }
}
