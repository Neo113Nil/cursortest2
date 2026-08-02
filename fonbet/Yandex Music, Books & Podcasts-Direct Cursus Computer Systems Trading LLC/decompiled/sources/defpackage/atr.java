package defpackage;

/* loaded from: classes.dex */
public final class atr extends ctr {
    public final /* synthetic */ int d = 1;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atr(rsr rsrVar, String str) {
        super(rsrVar, str);
        rsrVar.getClass();
        str.getClass();
        this.e = rsrVar.compileStatement(str);
    }

    @Override // defpackage.cko
    public final void E(int i, String str) {
        switch (this.d) {
            case 0:
                str.getClass();
                ((btr) this.e).E(i, str);
                return;
            case 1:
                str.getClass();
                a();
                ((dtr) this.e).bindString(i, str);
                return;
            default:
                str.getClass();
                a();
                p6g.H(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.cko
    public final void bindBlob(int i, byte[] bArr) {
        switch (this.d) {
            case 0:
                bArr.getClass();
                ((btr) this.e).bindBlob(i, bArr);
                return;
            case 1:
                bArr.getClass();
                a();
                ((dtr) this.e).bindBlob(i, bArr);
                return;
            default:
                bArr.getClass();
                a();
                p6g.H(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.cko
    public final void bindDouble(int i, double d) {
        switch (this.d) {
            case 0:
                ((btr) this.e).bindDouble(i, d);
                return;
            case 1:
                a();
                ((dtr) this.e).bindDouble(i, d);
                return;
            default:
                a();
                p6g.H(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.cko
    public final void bindLong(int i, long j) {
        switch (this.d) {
            case 0:
                ((btr) this.e).bindLong(i, j);
                return;
            case 1:
                a();
                ((dtr) this.e).bindLong(i, j);
                return;
            default:
                a();
                p6g.H(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.cko
    public final void bindNull(int i) {
        switch (this.d) {
            case 0:
                ((btr) this.e).bindNull(i);
                return;
            case 1:
                a();
                ((dtr) this.e).bindNull(i);
                return;
            default:
                a();
                p6g.H(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.ctr, defpackage.cko
    public void clearBindings() {
        switch (this.d) {
            case 0:
                ((btr) this.e).clearBindings();
                break;
            case 1:
                a();
                ((dtr) this.e).clearBindings();
                break;
            default:
                super.clearBindings();
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.d) {
            case 0:
                ((btr) this.e).close();
                break;
            case 1:
                ((dtr) this.e).close();
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
    }

    @Override // defpackage.cko
    public final byte[] getBlob(int i) {
        switch (this.d) {
            case 0:
                return ((btr) this.e).getBlob(i);
            case 1:
                a();
                p6g.H(21, "no row");
                throw null;
            default:
                a();
                p6g.H(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.cko
    public final int getColumnCount() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                a();
                break;
            default:
                a();
                break;
        }
        return 0;
    }

    @Override // defpackage.cko
    public final String getColumnName(int i) {
        switch (this.d) {
            case 0:
                return ((btr) this.e).getColumnName(i);
            case 1:
                a();
                p6g.H(21, "no row");
                throw null;
            default:
                a();
                p6g.H(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.cko
    public final double getDouble(int i) {
        switch (this.d) {
            case 0:
                return ((btr) this.e).getDouble(i);
            case 1:
                a();
                p6g.H(21, "no row");
                throw null;
            default:
                a();
                p6g.H(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.cko
    public final long getLong(int i) {
        switch (this.d) {
            case 0:
                return ((btr) this.e).getLong(i);
            case 1:
                a();
                p6g.H(21, "no row");
                throw null;
            default:
                a();
                p6g.H(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.cko
    public final boolean isNull(int i) {
        switch (this.d) {
            case 0:
                return ((btr) this.e).isNull(i);
            case 1:
                a();
                p6g.H(21, "no row");
                throw null;
            default:
                a();
                p6g.H(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.cko
    public boolean p0() {
        switch (this.d) {
            case 0:
                return ((btr) this.e).p0();
            default:
                return super.p0();
        }
    }

    @Override // defpackage.cko
    public final boolean q() {
        switch (this.d) {
            case 0:
                btr btrVar = (btr) this.e;
                boolean q = btrVar.q();
                boolean equalsIgnoreCase = btrVar.x0(0).equalsIgnoreCase("wal");
                rsr rsrVar = this.a;
                if (!equalsIgnoreCase) {
                    rsrVar.disableWriteAheadLogging();
                    break;
                } else {
                    rsrVar.enableWriteAheadLogging();
                    break;
                }
            case 1:
                a();
                ((dtr) this.e).execute();
                break;
            default:
                int ordinal = ((zsr) this.e).ordinal();
                rsr rsrVar2 = this.a;
                if (ordinal == 0) {
                    rsrVar2.setTransactionSuccessful();
                    rsrVar2.endTransaction();
                    break;
                } else if (ordinal == 1) {
                    rsrVar2.endTransaction();
                    break;
                } else if (ordinal == 2) {
                    rsrVar2.beginTransaction();
                    break;
                } else if (ordinal == 3) {
                    rsrVar2.beginTransactionNonExclusive();
                    break;
                } else if (ordinal != 4) {
                    b6e.s();
                    break;
                } else {
                    rsrVar2.beginTransactionReadOnly();
                    break;
                }
        }
        return false;
    }

    @Override // defpackage.ctr, defpackage.cko
    public void reset() {
        switch (this.d) {
            case 0:
                ((btr) this.e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // defpackage.cko
    public final String x0(int i) {
        switch (this.d) {
            case 0:
                return ((btr) this.e).x0(i);
            case 1:
                a();
                p6g.H(21, "no row");
                throw null;
            default:
                a();
                p6g.H(21, "no row");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atr(rsr rsrVar, String str, btr btrVar) {
        super(rsrVar, str);
        rsrVar.getClass();
        str.getClass();
        this.e = btrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atr(rsr rsrVar, String str, zsr zsrVar) {
        super(rsrVar, str);
        rsrVar.getClass();
        str.getClass();
        this.e = zsrVar;
    }
}
