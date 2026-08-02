package androidx.compose.ui.graphics.vector.compat;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.work.impl.WorkLauncherImpl;
import coil3.size.DimensionKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class AndroidVectorParser {
    public int config = 0;
    public final WorkLauncherImpl pathParser = new WorkLauncherImpl(9);
    public final XmlPullParser xmlParser;

    public AndroidVectorParser(XmlResourceParser xmlResourceParser) {
        this.xmlParser = xmlResourceParser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return Intrinsics.areEqual(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final float getNamedFloat(TypedArray typedArray, String str, int i, float f) {
        if (DimensionKt.hasAttribute(this.xmlParser, str)) {
            f = typedArray.getFloat(i, f);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.config) + (this.xmlParser.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.xmlParser);
        sb.append(", config=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.config, ')');
    }

    public final void updateConfig(int i) {
        this.config = i | this.config;
    }
}
