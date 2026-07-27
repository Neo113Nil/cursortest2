package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFABContextKtor extends CatchingFishServiceMoshiMVP {
    public final Runnable CatchingFishWorkManager;

    public CatchingFishFABContextKtor(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.CatchingFishWorkManager = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.CatchingFishWorkManager.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.CatchingFishWorkManager;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(CatchingFishBiometricBundle.CatchingFish(runnable));
        sb.append(", ");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", ");
        sb.append(this.CatchingFishDaggerWebsocket ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
