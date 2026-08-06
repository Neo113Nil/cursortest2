package defpackage;

/* loaded from: classes.dex */
public final class d7 extends android.view.autofill.AutofillManager$AutofillCallback {
    public static final defpackage.d7 IHQe1A4L2xu = new defpackage.d7();

    public final void onAutofillEvent(android.view.View view, int i, int i2) {
        super.onAutofillEvent(view, i, i2);
        android.util.Log.d("Autofill Status", i2 != 1 ? i2 != 2 ? i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
