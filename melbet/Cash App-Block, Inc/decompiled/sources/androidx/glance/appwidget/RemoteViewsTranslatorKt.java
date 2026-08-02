package androidx.glance.appwidget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.glance.AndroidResourceImageProvider;
import androidx.glance.BitmapImageProvider;
import androidx.glance.Emittable;
import androidx.glance.EmittableImage;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageKt;
import androidx.glance.ImageProvider;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.appwidget.translators.ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1;
import androidx.glance.appwidget.translators.TextTranslatorApi31Impl;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.ContentScale;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.EmittableColumn;
import androidx.glance.layout.EmittableSpacer;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.text.EmittableText;
import androidx.glance.text.TextStyle;
import androidx.glance.unit.Dimension;
import androidx.glance.unit.FixedColorProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public abstract class RemoteViewsTranslatorKt {
    public static final Intent buildShortcutIntent(Context context, String str, KClass kClass) {
        context.getClass();
        kClass.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setClass(context, PapaEvent.getJavaClass(kClass));
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        return intent;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.SquareStaffSwitchAccount.deepLinkSpecs;
    }

    public static final void setChildren(RemoteViews remoteViews, TranslationContext translationContext, InsertedViewInfo insertedViewInfo, List list) {
        int i = 0;
        for (Object obj : CollectionsKt.take(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            translateChild(remoteViews, translationContext.forChild(insertedViewInfo, i), (Emittable) obj);
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0283, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r13 != null ? r13.height : null, r0) != false) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void translateChild(RemoteViews remoteViews, TranslationContext translationContext, Emittable emittable) {
        LayoutType layoutType;
        if (emittable instanceof EmittableBox) {
            EmittableBox emittableBox = (EmittableBox) emittable;
            ArrayList arrayList = emittableBox.children;
            int size = arrayList.size();
            GlanceModifier glanceModifier = emittableBox.modifier;
            Alignment alignment = emittableBox.contentAlignment;
            InsertedViewInfo m1116insertContainerViewnVsUan0 = LayoutSelectionKt.m1116insertContainerViewnVsUan0(remoteViews, translationContext, LayoutType.Box, size, glanceModifier, new Alignment.Horizontal(alignment.horizontal), new Alignment.Vertical(alignment.vertical));
            ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableBox.modifier, m1116insertContainerViewnVsUan0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Emittable emittable2 = (Emittable) it.next();
                emittable2.setModifier(emittable2.getModifier().then(new AlignmentModifier(emittableBox.contentAlignment)));
            }
            setChildren(remoteViews, translationContext, m1116insertContainerViewnVsUan0, arrayList);
            return;
        }
        boolean z = true;
        if (emittable instanceof EmittableColumn) {
            EmittableColumn emittableColumn = (EmittableColumn) emittable;
            RadioButtonKt$isSelectableGroup$1 radioButtonKt$isSelectableGroup$1 = RadioButtonKt$isSelectableGroup$1.INSTANCE;
            LayoutType layoutType2 = (Build.VERSION.SDK_INT < 31 || !emittableColumn.modifier.any(radioButtonKt$isSelectableGroup$1)) ? LayoutType.Column : LayoutType.RadioColumn;
            ArrayList<Emittable> arrayList2 = emittableColumn.children;
            InsertedViewInfo m1116insertContainerViewnVsUan02 = LayoutSelectionKt.m1116insertContainerViewnVsUan0(remoteViews, translationContext, layoutType2, arrayList2.size(), emittableColumn.modifier, new Alignment.Horizontal(emittableColumn.horizontalAlignment), null);
            int i = m1116insertContainerViewnVsUan02.mainViewId;
            int i2 = emittableColumn.horizontalAlignment;
            int i3 = emittableColumn.verticalAlignment;
            int i4 = 8388611;
            if (i2 != 0) {
                if (i2 == 2) {
                    i4 = 8388613;
                } else if (i2 == 1) {
                    i4 = 1;
                } else {
                    Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) Alignment.Horizontal.m1123toStringimpl(i2)));
                }
            }
            int i5 = 48;
            if (i3 != 0) {
                if (i3 == 2) {
                    i5 = 80;
                } else if (i3 == 1) {
                    i5 = 16;
                } else {
                    Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) Alignment.Vertical.m1125toStringimpl(i3)));
                }
            }
            remoteViews.setInt(i, "setGravity", i4 | i5);
            ApplyModifiersKt.applyModifiers(TranslationContext.m1120copytbIExKY$default(translationContext, 0, null, null, null, 0L, null, 28671), remoteViews, emittableColumn.modifier, m1116insertContainerViewnVsUan02);
            setChildren(remoteViews, translationContext, m1116insertContainerViewnVsUan02, arrayList2);
            if (emittableColumn.modifier.any(radioButtonKt$isSelectableGroup$1)) {
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    for (Emittable emittable3 : arrayList2) {
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (emittable instanceof EmittableText) {
            EmittableText emittableText = (EmittableText) emittable;
            InsertedViewInfo insertView = LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.Text, emittableText.modifier);
            int i6 = insertView.mainViewId;
            CharSequence charSequence = emittableText.text;
            TextStyle textStyle = emittableText.style;
            int i7 = emittableText.maxLines;
            Context context = translationContext.context;
            if (i7 != Integer.MAX_VALUE) {
                remoteViews.setInt(i6, "setMaxLines", i7);
            }
            if (textStyle == null) {
                remoteViews.setTextViewText(i6, charSequence);
            } else {
                SpannableString spannableString = new SpannableString(charSequence);
                int length = spannableString.length();
                TextUnit textUnit = textStyle.fontSize;
                if (textUnit != null) {
                    long j = textUnit.packedValue;
                    if (!TextUnit.m1060isSpimpl(j)) {
                        a$$ExternalSyntheticBUOutline0.m$3("Only Sp is currently supported for font sizes");
                        return;
                    }
                    remoteViews.setTextViewTextSize(i6, 2, TextUnit.m1059getValueimpl(j));
                }
                ArrayList arrayList3 = new ArrayList();
                if (textStyle.fontWeight != null) {
                    arrayList3.add(new TextAppearanceSpan(context, R.style.Glance_AppWidget_TextAppearance_Medium));
                }
                if (textStyle.textAlign != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        TextTranslatorApi31Impl.INSTANCE.setTextViewGravity(remoteViews, i6, 49);
                    } else {
                        arrayList3.add(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER));
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    spannableString.setSpan((ParcelableSpan) it2.next(), 0, length, 17);
                }
                remoteViews.setTextViewText(i6, spannableString);
                FixedColorProvider fixedColorProvider = textStyle.color;
                if (fixedColorProvider != null) {
                    remoteViews.setTextColor(i6, ColorKt.m694toArgb8_81llA(fixedColorProvider.color));
                } else {
                    Log.w("GlanceAppWidget", "Unexpected text color: " + fixedColorProvider);
                }
            }
            ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableText.modifier, insertView);
            return;
        }
        if (emittable instanceof EmittableSpacer) {
            EmittableSpacer emittableSpacer = (EmittableSpacer) emittable;
            ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableSpacer.modifier, LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.Frame, emittableSpacer.modifier));
            return;
        }
        if (!(emittable instanceof EmittableImage)) {
            if (!(emittable instanceof EmittableSizeBox)) {
                Path$$ExternalSyntheticBUOutline0.m(emittable.getClass().getCanonicalName(), "Unknown element type ");
                return;
            }
            ArrayList arrayList4 = ((EmittableSizeBox) emittable).children;
            if (arrayList4.size() <= 1) {
                Emittable emittable4 = (Emittable) CollectionsKt.firstOrNull((List) arrayList4);
                if (emittable4 != null) {
                    translateChild(remoteViews, translationContext, emittable4);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList4.size() + ". The normalization of the composition tree failed.").toString());
        }
        EmittableImage emittableImage = (EmittableImage) emittable;
        boolean isDecorative = ImageKt.isDecorative(emittableImage);
        int i8 = emittableImage.contentScale;
        if (i8 == 0) {
            layoutType = isDecorative ? LayoutType.ImageCropDecorative : LayoutType.ImageCrop;
        } else {
            LayoutType layoutType3 = LayoutType.ImageFit;
            if (i8 == 1) {
                if (isDecorative) {
                    layoutType = LayoutType.ImageFitDecorative;
                }
                layoutType = layoutType3;
            } else if (i8 == 2) {
                layoutType = isDecorative ? LayoutType.ImageFillBoundsDecorative : LayoutType.ImageFillBounds;
            } else {
                Log.w("GlanceAppWidget", "Unsupported ContentScale user: " + ((Object) ContentScale.m1127toStringimpl(emittableImage.contentScale)));
                layoutType = layoutType3;
            }
        }
        InsertedViewInfo insertView2 = LayoutSelectionKt.insertView(remoteViews, translationContext, layoutType, emittableImage.modifier);
        int i9 = insertView2.mainViewId;
        ImageProvider imageProvider = emittableImage.provider;
        if (imageProvider instanceof AndroidResourceImageProvider) {
            remoteViews.setImageViewResource(i9, ((AndroidResourceImageProvider) imageProvider).resId);
        } else {
            if (!(imageProvider instanceof BitmapImageProvider)) {
                a$$ExternalSyntheticBUOutline0.m$3("An unsupported ImageProvider type was used.");
                return;
            }
            remoteViews.setImageViewBitmap(i9, ((BitmapImageProvider) imageProvider).bitmap);
        }
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableImage.modifier, insertView2);
        if (emittableImage.contentScale == 1) {
            Dimension.Fill fill = ((WidthModifier) emittableImage.modifier.foldIn(null, ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1.INSTANCE)) != null ? Dimension.Fill.INSTANCE : null;
            Dimension.Wrap wrap = Dimension.Wrap.INSTANCE;
            if (!Intrinsics.areEqual(fill, wrap)) {
                HeightModifier heightModifier = (HeightModifier) emittableImage.modifier.foldIn(null, ImageTranslatorKt$translateEmittableImage$$inlined$findModifier$1.INSTANCE$1);
            }
            remoteViews.setBoolean(i9, "setAdjustViewBounds", z);
        }
        z = false;
        remoteViews.setBoolean(i9, "setAdjustViewBounds", z);
    }

    /* renamed from: translateComposition-KpG6l20, reason: not valid java name */
    public static final RemoteViews m1117translateCompositionKpG6l20(Context context, int i, RemoteViewsRoot remoteViewsRoot, LayoutConfiguration layoutConfiguration, int i2, ComponentName componentName) {
        TranslationContext translationContext = new TranslationContext(context, i, context.getResources().getConfiguration().getLayoutDirection() == 1, layoutConfiguration, -1, false, new AtomicInteger(1), new InsertedViewInfo(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName);
        ArrayList<Emittable> arrayList = remoteViewsRoot.children;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((Emittable) it.next()) instanceof EmittableSizeBox)) {
                    Emittable emittable = (Emittable) CollectionsKt.single((List) arrayList);
                    RemoteViewsInfo createRootView = LayoutSelectionKt.createRootView(translationContext, emittable.getModifier(), i2);
                    RemoteViews remoteViews = createRootView.remoteViews;
                    translateChild(remoteViews, TranslationContext.m1120copytbIExKY$default(translationContext.forChild(createRootView.view, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, null, 32447), emittable);
                    return remoteViews;
                }
            }
        }
        Object first = CollectionsKt.first((List) arrayList);
        first.getClass();
        SizeMode sizeMode = ((EmittableSizeBox) first).sizeMode;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Emittable emittable2 : arrayList) {
            emittable2.getClass();
            long j = ((EmittableSizeBox) emittable2).size;
            RemoteViewsInfo createRootView2 = LayoutSelectionKt.createRootView(translationContext, emittable2.getModifier(), i2);
            RemoteViews remoteViews2 = createRootView2.remoteViews;
            translateChild(remoteViews2, TranslationContext.m1120copytbIExKY$default(translationContext.forChild(createRootView2.view, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), j, null, 31935), emittable2);
            arrayList2.add(new Pair(new SizeF(DpSize.m1044getWidthD9Ej5fM(j), DpSize.m1043getHeightD9Ej5fM(j)), remoteViews2));
        }
        if (sizeMode instanceof SizeMode.Single) {
            return (RemoteViews) ((Pair) CollectionsKt.single((List) arrayList2)).second;
        }
        if (!Intrinsics.areEqual(sizeMode, SizeMode.Exact.INSTANCE)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.createRemoteViews(MapsKt__MapsKt.toMap(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            a$$ExternalSyntheticBUOutline0.m$3("unsupported views size");
            return null;
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((RemoteViews) ((Pair) it2.next()).second);
        }
        int size = arrayList3.size();
        if (size == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        a$$ExternalSyntheticBUOutline0.m$3("There must be between 1 and 2 views.");
        return null;
    }
}
