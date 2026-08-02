package defpackage;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes7.dex */
public final class v081 implements x071 {
    public final CheckBox a;
    public final ProgressBar b;

    public v081(CheckBox checkBox, ProgressBar progressBar) {
        this.a = checkBox;
        this.b = progressBar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v081)) {
            return false;
        }
        v081 v081Var = (v081) obj;
        return jl40.l(this.a, v081Var.a) && jl40.l(this.b, v081Var.b);
    }

    @Override // defpackage.x071
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // defpackage.x071
    public final CheckBox getMuteControl() {
        return this.a;
    }

    @Override // defpackage.x071
    public final ProgressBar getVideoProgress() {
        return this.b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.a;
        int hashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.b;
        return (hashCode + (progressBar != null ? progressBar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.a + ", videoProgress=" + this.b + ", countDownProgress=null)";
    }
}
