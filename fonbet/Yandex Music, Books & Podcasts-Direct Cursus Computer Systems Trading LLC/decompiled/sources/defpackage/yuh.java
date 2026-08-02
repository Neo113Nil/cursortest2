package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.media3.session.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class yuh implements fvh {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvh b;

    public /* synthetic */ yuh(fvh fvhVar, int i) {
        this.a = i;
        this.b = fvhVar;
    }

    @Override // defpackage.fvh
    public final Object h(i iVar, final wrh wrhVar, final int i) {
        switch (this.a) {
            case 0:
                if (iVar != null) {
                    throw new ClassCastException();
                }
                final int i2 = 0;
                gvh.L0(null, wrhVar, i, this.b, new ua6() { // from class: zuh
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
                    @Override // defpackage.ua6
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void accept(Object obj) {
                        vxf vxfVar;
                        vxf vxfVar2;
                        ump umpVar;
                        int i3 = i2;
                        int i4 = i;
                        wrh wrhVar2 = wrhVar;
                        switch (i3) {
                            case 0:
                                try {
                                    try {
                                        vxfVar2 = (vxf) ((lcg) obj).get();
                                        vq1.y(vxfVar2, "LibraryResult must not be null");
                                    } catch (InterruptedException e) {
                                        e = e;
                                        vq1.o0("MediaSessionStub", "Library operation failed", e);
                                        String str = vxf.g;
                                        qlp qlpVar = new qlp("no error message provided", -1, Bundle.EMPTY);
                                        vxfVar = new vxf(qlpVar.a, SystemClock.elapsedRealtime(), null, qlpVar, null, 4);
                                        vxfVar2 = vxfVar;
                                        vrh vrhVar = wrhVar2.d;
                                        vq1.B(vrhVar);
                                        vrhVar.f(i4, vxfVar2);
                                        return;
                                    } catch (CancellationException e2) {
                                        vq1.o0("MediaSessionStub", "Library operation cancelled", e2);
                                        String str2 = vxf.g;
                                        qlp qlpVar2 = new qlp("no error message provided", 1, Bundle.EMPTY);
                                        vxfVar = new vxf(qlpVar2.a, SystemClock.elapsedRealtime(), null, qlpVar2, null, 4);
                                        vxfVar2 = vxfVar;
                                        vrh vrhVar2 = wrhVar2.d;
                                        vq1.B(vrhVar2);
                                        vrhVar2.f(i4, vxfVar2);
                                        return;
                                    } catch (ExecutionException e3) {
                                        e = e3;
                                        vq1.o0("MediaSessionStub", "Library operation failed", e);
                                        String str3 = vxf.g;
                                        qlp qlpVar3 = new qlp("no error message provided", -1, Bundle.EMPTY);
                                        vxfVar = new vxf(qlpVar3.a, SystemClock.elapsedRealtime(), null, qlpVar3, null, 4);
                                        vxfVar2 = vxfVar;
                                        vrh vrhVar22 = wrhVar2.d;
                                        vq1.B(vrhVar22);
                                        vrhVar22.f(i4, vxfVar2);
                                        return;
                                    }
                                    vrh vrhVar222 = wrhVar2.d;
                                    vq1.B(vrhVar222);
                                    vrhVar222.f(i4, vxfVar2);
                                } catch (RemoteException e4) {
                                    vq1.o0("MediaSessionStub", "Failed to send result to browser " + wrhVar2, e4);
                                    return;
                                }
                            default:
                                try {
                                    umpVar = (ump) ((lcg) obj).get();
                                    vq1.y(umpVar, "SessionResult must not be null");
                                } catch (InterruptedException e5) {
                                    e = e5;
                                    vq1.o0("MediaSessionStub", "Session operation failed", e);
                                    umpVar = new ump(e.getCause() instanceof UnsupportedOperationException ? -6 : -1);
                                } catch (CancellationException e6) {
                                    vq1.o0("MediaSessionStub", "Session operation cancelled", e6);
                                    umpVar = new ump(1);
                                } catch (ExecutionException e7) {
                                    e = e7;
                                    vq1.o0("MediaSessionStub", "Session operation failed", e);
                                    umpVar = new ump(e.getCause() instanceof UnsupportedOperationException ? -6 : -1);
                                }
                                gvh.P0(wrhVar2, i4, umpVar);
                                break;
                        }
                    }
                });
                throw null;
            default:
                final int i3 = 1;
                return gvh.L0(iVar, wrhVar, i, this.b, new ua6() { // from class: zuh
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
                    @Override // defpackage.ua6
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void accept(Object obj) {
                        vxf vxfVar;
                        vxf vxfVar2;
                        ump umpVar;
                        int i32 = i3;
                        int i4 = i;
                        wrh wrhVar2 = wrhVar;
                        switch (i32) {
                            case 0:
                                try {
                                    try {
                                        vxfVar2 = (vxf) ((lcg) obj).get();
                                        vq1.y(vxfVar2, "LibraryResult must not be null");
                                    } catch (InterruptedException e) {
                                        e = e;
                                        vq1.o0("MediaSessionStub", "Library operation failed", e);
                                        String str3 = vxf.g;
                                        qlp qlpVar3 = new qlp("no error message provided", -1, Bundle.EMPTY);
                                        vxfVar = new vxf(qlpVar3.a, SystemClock.elapsedRealtime(), null, qlpVar3, null, 4);
                                        vxfVar2 = vxfVar;
                                        vrh vrhVar222 = wrhVar2.d;
                                        vq1.B(vrhVar222);
                                        vrhVar222.f(i4, vxfVar2);
                                        return;
                                    } catch (CancellationException e2) {
                                        vq1.o0("MediaSessionStub", "Library operation cancelled", e2);
                                        String str2 = vxf.g;
                                        qlp qlpVar2 = new qlp("no error message provided", 1, Bundle.EMPTY);
                                        vxfVar = new vxf(qlpVar2.a, SystemClock.elapsedRealtime(), null, qlpVar2, null, 4);
                                        vxfVar2 = vxfVar;
                                        vrh vrhVar2222 = wrhVar2.d;
                                        vq1.B(vrhVar2222);
                                        vrhVar2222.f(i4, vxfVar2);
                                        return;
                                    } catch (ExecutionException e3) {
                                        e = e3;
                                        vq1.o0("MediaSessionStub", "Library operation failed", e);
                                        String str32 = vxf.g;
                                        qlp qlpVar32 = new qlp("no error message provided", -1, Bundle.EMPTY);
                                        vxfVar = new vxf(qlpVar32.a, SystemClock.elapsedRealtime(), null, qlpVar32, null, 4);
                                        vxfVar2 = vxfVar;
                                        vrh vrhVar22222 = wrhVar2.d;
                                        vq1.B(vrhVar22222);
                                        vrhVar22222.f(i4, vxfVar2);
                                        return;
                                    }
                                    vrh vrhVar222222 = wrhVar2.d;
                                    vq1.B(vrhVar222222);
                                    vrhVar222222.f(i4, vxfVar2);
                                } catch (RemoteException e4) {
                                    vq1.o0("MediaSessionStub", "Failed to send result to browser " + wrhVar2, e4);
                                    return;
                                }
                            default:
                                try {
                                    umpVar = (ump) ((lcg) obj).get();
                                    vq1.y(umpVar, "SessionResult must not be null");
                                } catch (InterruptedException e5) {
                                    e = e5;
                                    vq1.o0("MediaSessionStub", "Session operation failed", e);
                                    umpVar = new ump(e.getCause() instanceof UnsupportedOperationException ? -6 : -1);
                                } catch (CancellationException e6) {
                                    vq1.o0("MediaSessionStub", "Session operation cancelled", e6);
                                    umpVar = new ump(1);
                                } catch (ExecutionException e7) {
                                    e = e7;
                                    vq1.o0("MediaSessionStub", "Session operation failed", e);
                                    umpVar = new ump(e.getCause() instanceof UnsupportedOperationException ? -6 : -1);
                                }
                                gvh.P0(wrhVar2, i4, umpVar);
                                break;
                        }
                    }
                });
        }
    }
}
