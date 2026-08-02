package androidx.glance;

import androidx.glance.GlanceModifier;
import androidx.glance.layout.ContentScale;

/* loaded from: classes3.dex */
public final class BackgroundModifier$Image implements GlanceModifier.Element {
    public final AndroidResourceImageProvider imageProvider;

    public BackgroundModifier$Image(AndroidResourceImageProvider androidResourceImageProvider) {
        this.imageProvider = androidResourceImageProvider;
    }

    public final String toString() {
        return "BackgroundModifier(colorFilter=null, imageProvider=" + this.imageProvider + ", contentScale=" + ((Object) ContentScale.m1127toStringimpl(2)) + ')';
    }
}
