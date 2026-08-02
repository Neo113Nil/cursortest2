package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class q2w {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q2w);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.wizard_skip_bottom_sheet_button_text_later) + f1d.a(R.string.wizard_skip_bottom_sheet_button_text_continue, f1d.a(R.string.wizard_skip_bottom_sheet_description, Integer.hashCode(R.string.wizard_skip_bottom_sheet_title) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("WizardSkipDialogStringResources(titleRes=", R.string.wizard_skip_bottom_sheet_title, R.string.wizard_skip_bottom_sheet_description, ", subtitleRes=", ", continueButtonRes=");
        l.append(R.string.wizard_skip_bottom_sheet_button_text_continue);
        l.append(", laterButtonRes=");
        l.append(R.string.wizard_skip_bottom_sheet_button_text_later);
        l.append(")");
        return l.toString();
    }
}
