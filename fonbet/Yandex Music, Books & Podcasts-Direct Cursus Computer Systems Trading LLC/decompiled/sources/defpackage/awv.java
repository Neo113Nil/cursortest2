package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class awv {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof awv);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.wizard_progress_button_text_back) + f1d.a(R.string.wizard_progress_button_text_later, Integer.hashCode(R.string.wizard_progress_button_text_continue) * 31, 31);
    }

    public final String toString() {
        return f1d.i(dfi.l("WizardFooterStringResources(saveButtonRes=", R.string.wizard_progress_button_text_continue, R.string.wizard_progress_button_text_later, ", chooseLaterRes=", ", backButtonRes="), R.string.wizard_progress_button_text_back, ")");
    }
}
