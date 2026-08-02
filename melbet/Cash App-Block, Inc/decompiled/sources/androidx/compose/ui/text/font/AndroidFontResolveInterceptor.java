package androidx.compose.ui.text.font;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    public final int fontWeightAdjustment;

    public AndroidFontResolveInterceptor(int i) {
        this.fontWeightAdjustment = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) obj).fontWeightAdjustment;
    }

    public final int hashCode() {
        return Integer.hashCode(this.fontWeightAdjustment);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.fontWeightAdjustment, ')');
    }
}
