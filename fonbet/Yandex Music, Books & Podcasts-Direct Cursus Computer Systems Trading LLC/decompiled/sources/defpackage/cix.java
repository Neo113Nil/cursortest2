package defpackage;

import android.os.Bundle;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class cix extends pww implements IInterface {
    public final yee h;
    public final i8s i;
    public final /* synthetic */ ikx j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cix(ikx ikxVar, yee yeeVar, i8s i8sVar) {
        super(5);
        this.j = ikxVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.h = yeeVar;
        this.i = i8sVar;
    }

    public void S0(Bundle bundle) {
        this.j.a.c(this.i);
        this.h.e("onCompleteUpdate", new Object[0]);
    }

    public void T0(Bundle bundle) {
        this.j.a.c(this.i);
        this.h.e("onRequestInfo", new Object[0]);
    }
}
