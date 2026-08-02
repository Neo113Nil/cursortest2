package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public abstract class zaa implements IInterface {
    public final /* synthetic */ int $r8$classId;
    public final IBinder zaa;
    public final String zab;

    public /* synthetic */ zaa(IBinder iBinder, String str, int i) {
        this.$r8$classId = i;
        this.zaa = iBinder;
        this.zab = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.$r8$classId;
        return this.zaa;
    }

    public void b(Parcel parcel, int i) {
        try {
            this.zaa.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel zaa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zab);
        return obtain;
    }

    public void zac(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zaa.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel zba() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zab);
        return obtain;
    }

    public void zbb(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zaa.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel zzB(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zaa.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel zzJ(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zaa.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel zzP(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zaa.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel zza() {
        int i = this.$r8$classId;
        String str = this.zab;
        switch (i) {
            case 2:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            case 3:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
            case 4:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(str);
                return obtain3;
            case 5:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(str);
                return obtain4;
            case 6:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(str);
                return obtain5;
            case 7:
                Parcel obtain6 = Parcel.obtain();
                obtain6.writeInterfaceToken(str);
                return obtain6;
            case 8:
                Parcel obtain7 = Parcel.obtain();
                obtain7.writeInterfaceToken(str);
                return obtain7;
            default:
                Parcel obtain8 = Parcel.obtain();
                obtain8.writeInterfaceToken(str);
                return obtain8;
        }
    }

    public Parcel zzb(Parcel parcel, int i) {
        int i2 = this.$r8$classId;
        IBinder iBinder = this.zaa;
        switch (i2) {
            case 3:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } finally {
                    }
                } catch (RuntimeException e) {
                    obtain.recycle();
                    throw e;
                }
            case 4:
            case 5:
            default:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } catch (RuntimeException e2) {
                        obtain2.recycle();
                        throw e2;
                    }
                } finally {
                }
            case 6:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } finally {
                    }
                } catch (RuntimeException e3) {
                    obtain3.recycle();
                    throw e3;
                }
            case 7:
                Parcel obtain4 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain4, 0);
                        obtain4.readException();
                        return obtain4;
                    } finally {
                    }
                } catch (RuntimeException e4) {
                    obtain4.recycle();
                    throw e4;
                }
            case 8:
                Parcel obtain5 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, obtain5, 0);
                        obtain5.readException();
                        return obtain5;
                    } catch (RuntimeException e5) {
                        obtain5.recycle();
                        throw e5;
                    }
                } finally {
                }
        }
    }

    public void zzc(Parcel parcel, int i) {
        Parcel obtain;
        int i2 = this.$r8$classId;
        IBinder iBinder = this.zaa;
        switch (i2) {
            case 3:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 4:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 5:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 6:
            default:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 7:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 8:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void zzd(Parcel parcel) {
        try {
            this.zaa.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
