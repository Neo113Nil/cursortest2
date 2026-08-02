package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.m3b1;
import defpackage.mw2;
import defpackage.tje;
import defpackage.z3v;
import defpackage.zy11;
import java.io.Closeable;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalTypeGetterVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;

/* loaded from: classes4.dex */
public abstract class a implements z3v {
    public final IVerificationRouter a;
    public mw2 b;
    public boolean c;
    public IVerificationFlow d;
    public Closeable e;

    public a(IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter) {
        this.a = iVerificationRouter;
        tje.N(m3b1.c(this), null, null, new BaseVerificationState$1(iVerificationFlow, this, null), 3);
        this.d = iVerificationFlow;
    }

    public final void a() {
        EbsLogger.INSTANCE.info("State[" + f() + "]> destroy");
        Closeable closeable = this.e;
        if (closeable != null) {
            closeable.close();
        }
        this.e = null;
        this.d = null;
    }

    public final void b() {
        tje.N(m3b1.c(this), null, null, new BaseVerificationState$emitProcessEvent$1(this, null), 3);
        IVerificationFlow iVerificationFlow = this.d;
        if (iVerificationFlow != null) {
            iVerificationFlow.emit(new Event.Process(null, 1, null));
        }
    }

    public final void c(Exception exc) {
        EbsLogger ebsLogger = EbsLogger.INSTANCE;
        ebsLogger.info("State[" + f() + "]> error");
        ebsLogger.error(exc);
        IVerificationFlow iVerificationFlow = this.d;
        if (iVerificationFlow != null) {
            iVerificationFlow.emit(new Event.Error(exc));
        }
        this.c = false;
    }

    public final void d(Object obj) {
        EbsLogger.INSTANCE.info("State[" + f() + "]> finish");
        IVerificationFlow iVerificationFlow = this.d;
        if (iVerificationFlow != null) {
            iVerificationFlow.emit(new Event.Finish(obj));
        }
        this.c = false;
    }

    public final String f() {
        return getClass().getSimpleName();
    }

    public void g(Exception exc) {
        this.c = false;
        this.a.gotoNoInternetConnectionError(exc);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IState
    public final Closeable getCoroutineScope() {
        return this.e;
    }

    @Override // defpackage.z3v
    public Object getValue(Class cls, Continuation continuation) {
        throw new IllegalTypeGetterVerificationFlowEbsException(this, null, 2, null);
    }

    public Object h(Object obj, Continuation continuation) {
        return zy11.a;
    }

    public abstract void i(Object obj);

    public final void j(Object obj) {
        EbsLogger ebsLogger = EbsLogger.INSTANCE;
        ebsLogger.info("State[" + f() + "]> process");
        if (this.c) {
            ebsLogger.warning("State[" + f() + "]> process -> isProcessing");
            return;
        }
        ebsLogger.info("State[" + f() + "]> onProcess");
        this.c = true;
        tje.N(m3b1.c(this), null, null, new BaseVerificationState$process$1(this, obj, null), 3);
    }

    public void k() {
        this.a.closeNoInternetConnectionError();
        mw2 mw2Var = this.b;
        if (mw2Var != null) {
            mw2Var.invoke();
        }
    }

    public final void l(Object obj) {
        EbsLogger.INSTANCE.info("State[" + f() + "]> start");
        i(obj);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IState
    public final void setCoroutineScope(Closeable closeable) {
        this.e = closeable;
    }
}
