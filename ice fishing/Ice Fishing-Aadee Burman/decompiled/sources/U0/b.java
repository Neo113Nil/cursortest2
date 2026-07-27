package U0;

/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3138n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.f3138n = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.f3138n;
        synchronized (this) {
            switch (i) {
            }
            return this;
        }
    }
}
