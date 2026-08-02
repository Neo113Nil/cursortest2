package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FontVariation$Settings {
    public final List settings;

    public FontVariation$Settings(FontVariation$Setting... fontVariation$SettingArr) {
        if (fontVariation$SettingArr.length <= 0) {
            this.settings = ArraysKt___ArraysKt.toList(fontVariation$SettingArr);
        } else {
            FontVariation$Setting fontVariation$Setting = fontVariation$SettingArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontVariation$Settings) {
            return Intrinsics.areEqual(this.settings, ((FontVariation$Settings) obj).settings);
        }
        return false;
    }

    public final int hashCode() {
        return this.settings.hashCode();
    }
}
