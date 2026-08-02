package defpackage;

/* loaded from: classes5.dex */
public final class q0 extends IllegalStateException {
    public final /* synthetic */ int a;
    public Exception b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(String str, Exception exc) {
        super(str);
        this.a = 0;
        this.b = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        switch (this.a) {
        }
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(String str, int i) {
        super(str);
        this.a = i;
    }
}
