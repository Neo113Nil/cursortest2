package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;

/* loaded from: classes2.dex */
public final class vce implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactsFragment b;

    public /* synthetic */ vce(ContactsFragment contactsFragment, int i) {
        this.a = i;
        this.b = contactsFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        ContactsFragment contactsFragment = this.b;
        switch (i) {
        }
        return contactsFragment.getViewLifecycleOwner().getLifecycle();
    }
}
