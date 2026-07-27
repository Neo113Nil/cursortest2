package kotlin.text;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class CatchingFishPayPalLifecycle implements Runnable {
    public final String CatchingFishReduxKtor;

    public CatchingFishPayPalLifecycle(String str, Object... objArr) {
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        this.CatchingFishReduxKtor = String.format(Locale.US, str, objArr);
    }

    public abstract void CatchingFishParcelableFAB();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.CatchingFishReduxKtor);
        try {
            CatchingFishParcelableFAB();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
