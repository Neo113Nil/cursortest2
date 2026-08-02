package androidx.glance.color;

import androidx.glance.unit.ResourceColorProvider;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class DynamicThemeColorProviders {
    public static final DynamicThemeColorProviders INSTANCE = new DynamicThemeColorProviders(new ResourceColorProvider(R.color.glance_colorPrimary), new ResourceColorProvider(R.color.glance_colorOnPrimary), new ResourceColorProvider(R.color.glance_colorPrimaryContainer), new ResourceColorProvider(R.color.glance_colorOnPrimaryContainer), new ResourceColorProvider(R.color.glance_colorSecondary), new ResourceColorProvider(R.color.glance_colorOnSecondary), new ResourceColorProvider(R.color.glance_colorSecondaryContainer), new ResourceColorProvider(R.color.glance_colorOnSecondaryContainer), new ResourceColorProvider(R.color.glance_colorTertiary), new ResourceColorProvider(R.color.glance_colorOnTertiary), new ResourceColorProvider(R.color.glance_colorTertiaryContainer), new ResourceColorProvider(R.color.glance_colorOnTertiaryContainer), new ResourceColorProvider(R.color.glance_colorError), new ResourceColorProvider(R.color.glance_colorErrorContainer), new ResourceColorProvider(R.color.glance_colorOnError), new ResourceColorProvider(R.color.glance_colorOnErrorContainer), new ResourceColorProvider(R.color.glance_colorBackground), new ResourceColorProvider(R.color.glance_colorOnBackground), new ResourceColorProvider(R.color.glance_colorSurface), new ResourceColorProvider(R.color.glance_colorOnSurface), new ResourceColorProvider(R.color.glance_colorSurfaceVariant), new ResourceColorProvider(R.color.glance_colorOnSurfaceVariant), new ResourceColorProvider(R.color.glance_colorOutline), new ResourceColorProvider(R.color.glance_colorOnSurfaceInverse), new ResourceColorProvider(R.color.glance_colorSurfaceInverse), new ResourceColorProvider(R.color.glance_colorPrimaryInverse), new ResourceColorProvider(R.color.glance_colorWidgetBackground));
    public final ResourceColorProvider background;
    public final ResourceColorProvider error;
    public final ResourceColorProvider errorContainer;
    public final ResourceColorProvider inverseOnSurface;
    public final ResourceColorProvider inversePrimary;
    public final ResourceColorProvider inverseSurface;
    public final ResourceColorProvider onBackground;
    public final ResourceColorProvider onError;
    public final ResourceColorProvider onErrorContainer;
    public final ResourceColorProvider onPrimary;
    public final ResourceColorProvider onPrimaryContainer;
    public final ResourceColorProvider onSecondary;
    public final ResourceColorProvider onSecondaryContainer;
    public final ResourceColorProvider onSurface;
    public final ResourceColorProvider onSurfaceVariant;
    public final ResourceColorProvider onTertiary;
    public final ResourceColorProvider onTertiaryContainer;
    public final ResourceColorProvider outline;
    public final ResourceColorProvider primary;
    public final ResourceColorProvider primaryContainer;
    public final ResourceColorProvider secondary;
    public final ResourceColorProvider secondaryContainer;
    public final ResourceColorProvider surface;
    public final ResourceColorProvider surfaceVariant;
    public final ResourceColorProvider tertiary;
    public final ResourceColorProvider tertiaryContainer;
    public final ResourceColorProvider widgetBackground;

    public DynamicThemeColorProviders(ResourceColorProvider resourceColorProvider, ResourceColorProvider resourceColorProvider2, ResourceColorProvider resourceColorProvider3, ResourceColorProvider resourceColorProvider4, ResourceColorProvider resourceColorProvider5, ResourceColorProvider resourceColorProvider6, ResourceColorProvider resourceColorProvider7, ResourceColorProvider resourceColorProvider8, ResourceColorProvider resourceColorProvider9, ResourceColorProvider resourceColorProvider10, ResourceColorProvider resourceColorProvider11, ResourceColorProvider resourceColorProvider12, ResourceColorProvider resourceColorProvider13, ResourceColorProvider resourceColorProvider14, ResourceColorProvider resourceColorProvider15, ResourceColorProvider resourceColorProvider16, ResourceColorProvider resourceColorProvider17, ResourceColorProvider resourceColorProvider18, ResourceColorProvider resourceColorProvider19, ResourceColorProvider resourceColorProvider20, ResourceColorProvider resourceColorProvider21, ResourceColorProvider resourceColorProvider22, ResourceColorProvider resourceColorProvider23, ResourceColorProvider resourceColorProvider24, ResourceColorProvider resourceColorProvider25, ResourceColorProvider resourceColorProvider26, ResourceColorProvider resourceColorProvider27) {
        this.primary = resourceColorProvider;
        this.onPrimary = resourceColorProvider2;
        this.primaryContainer = resourceColorProvider3;
        this.onPrimaryContainer = resourceColorProvider4;
        this.secondary = resourceColorProvider5;
        this.onSecondary = resourceColorProvider6;
        this.secondaryContainer = resourceColorProvider7;
        this.onSecondaryContainer = resourceColorProvider8;
        this.tertiary = resourceColorProvider9;
        this.onTertiary = resourceColorProvider10;
        this.tertiaryContainer = resourceColorProvider11;
        this.onTertiaryContainer = resourceColorProvider12;
        this.error = resourceColorProvider13;
        this.errorContainer = resourceColorProvider14;
        this.onError = resourceColorProvider15;
        this.onErrorContainer = resourceColorProvider16;
        this.background = resourceColorProvider17;
        this.onBackground = resourceColorProvider18;
        this.surface = resourceColorProvider19;
        this.onSurface = resourceColorProvider20;
        this.surfaceVariant = resourceColorProvider21;
        this.onSurfaceVariant = resourceColorProvider22;
        this.outline = resourceColorProvider23;
        this.inverseOnSurface = resourceColorProvider24;
        this.inverseSurface = resourceColorProvider25;
        this.inversePrimary = resourceColorProvider26;
        this.widgetBackground = resourceColorProvider27;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DynamicThemeColorProviders dynamicThemeColorProviders = (DynamicThemeColorProviders) obj;
        return this.primary.equals(dynamicThemeColorProviders.primary) && this.onPrimary.equals(dynamicThemeColorProviders.onPrimary) && this.primaryContainer.equals(dynamicThemeColorProviders.primaryContainer) && this.onPrimaryContainer.equals(dynamicThemeColorProviders.onPrimaryContainer) && this.secondary.equals(dynamicThemeColorProviders.secondary) && this.onSecondary.equals(dynamicThemeColorProviders.onSecondary) && this.secondaryContainer.equals(dynamicThemeColorProviders.secondaryContainer) && this.onSecondaryContainer.equals(dynamicThemeColorProviders.onSecondaryContainer) && this.tertiary.equals(dynamicThemeColorProviders.tertiary) && this.onTertiary.equals(dynamicThemeColorProviders.onTertiary) && this.tertiaryContainer.equals(dynamicThemeColorProviders.tertiaryContainer) && this.onTertiaryContainer.equals(dynamicThemeColorProviders.onTertiaryContainer) && this.error.equals(dynamicThemeColorProviders.error) && this.errorContainer.equals(dynamicThemeColorProviders.errorContainer) && this.onError.equals(dynamicThemeColorProviders.onError) && this.onErrorContainer.equals(dynamicThemeColorProviders.onErrorContainer) && this.background.equals(dynamicThemeColorProviders.background) && this.onBackground.equals(dynamicThemeColorProviders.onBackground) && this.surface.equals(dynamicThemeColorProviders.surface) && this.onSurface.equals(dynamicThemeColorProviders.onSurface) && this.surfaceVariant.equals(dynamicThemeColorProviders.surfaceVariant) && this.onSurfaceVariant.equals(dynamicThemeColorProviders.onSurfaceVariant) && this.outline.equals(dynamicThemeColorProviders.outline) && this.inverseOnSurface.equals(dynamicThemeColorProviders.inverseOnSurface) && this.inverseSurface.equals(dynamicThemeColorProviders.inverseSurface) && this.inversePrimary.equals(dynamicThemeColorProviders.inversePrimary) && this.widgetBackground.equals(dynamicThemeColorProviders.widgetBackground);
    }

    public final int hashCode() {
        return Integer.hashCode(this.widgetBackground.resId) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inversePrimary.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inverseSurface.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inverseOnSurface.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.outline.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onSurfaceVariant.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.surfaceVariant.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onSurface.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.surface.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onBackground.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.background.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onErrorContainer.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onError.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.errorContainer.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.error.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onTertiaryContainer.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tertiaryContainer.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onTertiary.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tertiary.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onSecondaryContainer.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.secondaryContainer.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onSecondary.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.secondary.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onPrimaryContainer.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.primaryContainer.resId, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onPrimary.resId, Integer.hashCode(this.primary.resId) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ColorProviders(primary=" + this.primary + ", onPrimary=" + this.onPrimary + ", primaryContainer=" + this.primaryContainer + ", onPrimaryContainer=" + this.onPrimaryContainer + ", secondary=" + this.secondary + ", onSecondary=" + this.onSecondary + ", secondaryContainer=" + this.secondaryContainer + ", onSecondaryContainer=" + this.onSecondaryContainer + ", tertiary=" + this.tertiary + ", onTertiary=" + this.onTertiary + ", tertiaryContainer=" + this.tertiaryContainer + ", onTertiaryContainer=" + this.onTertiaryContainer + ", error=" + this.error + ", errorContainer=" + this.errorContainer + ", onError=" + this.onError + ", onErrorContainer=" + this.onErrorContainer + ", background=" + this.background + ", onBackground=" + this.onBackground + ", surface=" + this.surface + ", onSurface=" + this.onSurface + ", surfaceVariant=" + this.surfaceVariant + ", onSurfaceVariant=" + this.onSurfaceVariant + ", outline=" + this.outline + ", inverseOnSurface=" + this.inverseOnSurface + ", inverseSurface=" + this.inverseSurface + ", inversePrimary=" + this.inversePrimary + ")widgetBackground=" + this.widgetBackground;
    }
}
