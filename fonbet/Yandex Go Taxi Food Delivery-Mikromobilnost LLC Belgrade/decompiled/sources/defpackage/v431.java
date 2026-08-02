package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class v431 extends z431 {
    public final void d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            TypedArray i = uvb1.i(resources, theme, attributeSet, z0s.d);
            String string = i.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = i.getString(1);
            if (string2 != null) {
                this.a = n891.h(string2);
            }
            this.c = uvb1.h(xmlPullParser, "fillType") ? i.getInt(2, 0) : 0;
            i.recycle();
        }
    }
}
