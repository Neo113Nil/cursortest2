package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.ui.text.TextRange;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzf;

/* loaded from: classes.dex */
public final class TextUndoOperation {
    public static final zzf Saver = new zzf(2);
    public final boolean canMerge;
    public final int index;
    public final long postSelection;
    public final String postText;
    public final long preSelection;
    public final String preText;
    public final TextEditType textEditType;
    public final long timeInMillis;

    public TextUndoOperation(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2) {
        j3 = (i2 & 32) != 0 ? KeyMappingKt.timeNowMillis() : j3;
        z = (i2 & 64) != 0 ? true : z;
        this.index = i;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j;
        this.postSelection = j2;
        this.timeInMillis = j3;
        this.canMerge = z;
        if (str.length() == 0 && str2.length() == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Either pre or post text must not be empty");
            throw null;
        }
        this.textEditType = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? TextEditType.Replace : TextEditType.Delete : TextEditType.Insert;
    }

    public final TextDeleteType getDeletionType() {
        if (this.textEditType != TextEditType.Delete) {
            return TextDeleteType.NotByUser;
        }
        long j = this.postSelection;
        if (!TextRange.m987getCollapsedimpl(j)) {
            return TextDeleteType.NotByUser;
        }
        long j2 = this.preSelection;
        return TextRange.m987getCollapsedimpl(j2) ? ((int) (j2 >> 32)) > ((int) (j >> 32)) ? TextDeleteType.Start : TextDeleteType.End : (((int) (j2 >> 32)) == ((int) (j >> 32)) && ((int) (j2 >> 32)) == this.index) ? TextDeleteType.Inner : TextDeleteType.NotByUser;
    }
}
