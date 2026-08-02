package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.formview.components.arcade.ArcadeFormBadgedAvatar;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.cash.ColorsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormBadgedAvatar$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeFormBadgedAvatar f$0;

    public /* synthetic */ ArcadeFormBadgedAvatar$$ExternalSyntheticLambda0(ArcadeFormBadgedAvatar arcadeFormBadgedAvatar, int i) {
        this.$r8$classId = 1;
        this.f$0 = arcadeFormBadgedAvatar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [androidx.compose.ui.graphics.Color] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.squareup.cash.arcade.components.avatar.AvatarImage$Local, com.squareup.cash.arcade.components.avatar.AvatarImage$LocalIcon] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [com.squareup.cash.arcade.components.avatar.AvatarImage] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.squareup.cash.arcade.components.avatar.AvatarOverlay] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.graphics.Color] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31, types: [androidx.compose.ui.graphics.Color] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v44, types: [androidx.compose.ui.graphics.Color] */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th;
        AbstractPersistentList persistentList;
        ?? r6;
        ?? r19;
        Iterator it;
        ArrayList arrayList;
        ?? r21;
        ?? r2;
        long j;
        ?? r13;
        ?? r22;
        Object localIcon;
        Icons icons;
        long j2;
        AvatarSize avatarSize;
        GapComposer gapComposer;
        DiagonalAvatarValues diagonalAvatarValues;
        int i = this.$r8$classId;
        final ArcadeFormBadgedAvatar arcadeFormBadgedAvatar = this.f$0;
        final byte b = 0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 2;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(arcadeFormBadgedAvatar.imageLoader), Expect_jvmKt.rememberComposableLambda(-92279623, new ArcadeFormBadgedAvatar$$ExternalSyntheticLambda0(arcadeFormBadgedAvatar, i2, b), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                arcadeFormBadgedAvatar.Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    FormBlocker.Element.AvatarElement avatarElement = arcadeFormBadgedAvatar.element;
                    Throwable th2 = null;
                    if (avatarElement.ui_avatars.isEmpty()) {
                        gapComposer3.startReplaceGroup(-322886339);
                        List take = CollectionsKt.take(avatarElement.avatars, 3);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                        Iterator it2 = take.iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                Throwable th3 = th2;
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw th3;
                            }
                            FormBlocker.Element.AvatarElement.Avatar avatar = (FormBlocker.Element.AvatarElement.Avatar) next;
                            String str = avatar.monogram_text;
                            if (str == null) {
                                str = "";
                            }
                            String str2 = str;
                            gapComposer3.startReplaceGroup(2049000335);
                            Throwable th4 = th2;
                            int i5 = i3;
                            ?? localIcon2 = new AvatarImage.LocalIcon(Icons.AvatarFill24, 0L, 6);
                            Image image = avatar.image;
                            if (image == null) {
                                gapComposer3.startReplaceGroup(1693930341);
                                gapComposer3.end(false);
                                r6 = th4;
                            } else {
                                r6 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer3, 1994305564, image, gapComposer3, false);
                            }
                            if (r6 == 0) {
                                r6 = avatar.photo_url;
                            }
                            String str3 = r6;
                            if (str3 != null) {
                                AvatarImage.Remote.Image image2 = new AvatarImage.Remote.Image(str3, Intrinsics.areEqual(avatar.is_template_avatar, Boolean.TRUE), localIcon2, 0L, new Function3() { // from class: com.squareup.cash.formview.components.arcade.ArcadeFormBadgedAvatar$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i6 = b;
                                        ArcadeFormBadgedAvatar arcadeFormBadgedAvatar2 = arcadeFormBadgedAvatar;
                                        PainterRequest painterRequest = (PainterRequest) obj3;
                                        Composer composer3 = (Composer) obj4;
                                        ((Integer) obj5).getClass();
                                        switch (i6) {
                                            case 0:
                                                painterRequest.getClass();
                                                GapComposer gapComposer4 = (GapComposer) composer3;
                                                gapComposer4.startReplaceGroup(-1675853672);
                                                AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(painterRequest.url, arcadeFormBadgedAvatar2.imageLoader, null, gapComposer4, 0, 60);
                                                gapComposer4.end(false);
                                                return m1448rememberAsyncImagePainter5jETZwI;
                                            default:
                                                painterRequest.getClass();
                                                GapComposer gapComposer5 = (GapComposer) composer3;
                                                gapComposer5.startReplaceGroup(-222321344);
                                                AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI2 = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(painterRequest.url, arcadeFormBadgedAvatar2.imageLoader, null, gapComposer5, 0, 60);
                                                gapComposer5.end(false);
                                                return m1448rememberAsyncImagePainter5jETZwI2;
                                        }
                                    }
                                }, 56);
                                gapComposer3.end(false);
                                r19 = image2;
                            } else {
                                Throwable th5 = avatar.monogram_text == null ? localIcon2 : th4;
                                gapComposer3.end(false);
                                r19 = th5;
                            }
                            Integer num = avatar.counter_value;
                            if (i5 == 0) {
                                gapComposer3.startReplaceGroup(-1177687992);
                                gapComposer3.startReplaceGroup(235100667);
                                Color color = avatarElement.badge_background_color;
                                if (color == null) {
                                    gapComposer3.startReplaceGroup(-1207538084);
                                    gapComposer3.end(false);
                                    r13 = th4;
                                } else {
                                    r13 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, -1701520827, color, gapComposer3, false);
                                }
                                if (r13 == 0) {
                                    gapComposer3.startReplaceGroup(-1207468117);
                                    gapComposer3.end(false);
                                    r22 = th4;
                                    it = it2;
                                    arrayList = arrayList2;
                                } else {
                                    gapComposer3.startReplaceGroup(-1207468116);
                                    it = it2;
                                    long j3 = r13.value;
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                    Colors colors = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    arrayList = arrayList2;
                                    long j4 = colors.semantic.icon.standard;
                                    Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    r22 = Recorder$$ExternalSyntheticOutline1.m(gapComposer3, false, ColorsKt.m3988contrastAdjustedColorysEtTa8(j4, colors2.semantic.icon.inverse, j3));
                                }
                                long j5 = r22 != 0 ? r22.value : androidx.compose.ui.graphics.Color.Unspecified;
                                FormBlocker.Element.AvatarElement.Badge badge = avatarElement.badge;
                                if (badge == null) {
                                    gapComposer3.startReplaceGroup(-1207203873);
                                    gapComposer3.end(false);
                                    Image image3 = avatar.badge_image;
                                    if (image3 == null) {
                                        gapComposer3.startReplaceGroup(-1206681523);
                                        gapComposer3.end(false);
                                        gapComposer3.end(false);
                                        localIcon = th4;
                                        gapComposer3.end(false);
                                        r21 = localIcon;
                                    } else {
                                        gapComposer3.startReplaceGroup(-1206681522);
                                        final int i6 = 1;
                                        localIcon = new AvatarOverlay.RemoteImage(ThemablesKt.urlForTheme(image3, gapComposer3), false, r13 != 0 ? r13.value : androidx.compose.ui.graphics.Color.Unspecified, 0L, null, new Function3() { // from class: com.squareup.cash.formview.components.arcade.ArcadeFormBadgedAvatar$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                int i62 = i6;
                                                ArcadeFormBadgedAvatar arcadeFormBadgedAvatar2 = arcadeFormBadgedAvatar;
                                                PainterRequest painterRequest = (PainterRequest) obj3;
                                                Composer composer3 = (Composer) obj4;
                                                ((Integer) obj5).getClass();
                                                switch (i62) {
                                                    case 0:
                                                        painterRequest.getClass();
                                                        GapComposer gapComposer4 = (GapComposer) composer3;
                                                        gapComposer4.startReplaceGroup(-1675853672);
                                                        AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(painterRequest.url, arcadeFormBadgedAvatar2.imageLoader, null, gapComposer4, 0, 60);
                                                        gapComposer4.end(false);
                                                        return m1448rememberAsyncImagePainter5jETZwI;
                                                    default:
                                                        painterRequest.getClass();
                                                        GapComposer gapComposer5 = (GapComposer) composer3;
                                                        gapComposer5.startReplaceGroup(-222321344);
                                                        AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI2 = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(painterRequest.url, arcadeFormBadgedAvatar2.imageLoader, null, gapComposer5, 0, 60);
                                                        gapComposer5.end(false);
                                                        return m1448rememberAsyncImagePainter5jETZwI2;
                                                }
                                            }
                                        }, 24);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.startReplaceGroup(-1207203872);
                                    int i7 = ArcadeFormBadgedAvatar.WhenMappings.$EnumSwitchMapping$1[badge.ordinal()];
                                    if (i7 == 1) {
                                        icons = Icons.Check16;
                                    } else if (i7 == 2) {
                                        icons = Icons.RecurringAutomatic16;
                                    } else if (i7 == 3) {
                                        icons = Icons.Borrow16;
                                    } else {
                                        if (i7 != 4) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return th4;
                                        }
                                        icons = Icons.Hyperlink16;
                                    }
                                    Icons icons2 = icons;
                                    if (r13 == 0) {
                                        gapComposer3.startReplaceGroup(-87235094);
                                        Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                        if (colors3 == null) {
                                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        j2 = colors3.semantic.background.subtle;
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-87237047);
                                        gapComposer3.end(false);
                                        j2 = r13.value;
                                    }
                                    localIcon = new AvatarOverlay.LocalIcon(8, j2, j5, icons2);
                                    gapComposer3.end(false);
                                }
                                gapComposer3.end(false);
                                gapComposer3.end(false);
                                r21 = localIcon;
                            } else {
                                it = it2;
                                arrayList = arrayList2;
                                gapComposer3.startReplaceGroup(2146438580);
                                gapComposer3.end(false);
                                r21 = th4;
                            }
                            Color color2 = avatar.background_color;
                            if (color2 == null) {
                                gapComposer3.startReplaceGroup(2146582606);
                                gapComposer3.end(false);
                                r2 = th4;
                            } else {
                                r2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, -1177681389, color2, gapComposer3, false);
                            }
                            if (r2 == 0) {
                                String str4 = avatar.accent_color;
                                r2 = str4 != null ? new androidx.compose.ui.graphics.Color(ColorKt.Color(android.graphics.Color.parseColor(str4))) : th4;
                            }
                            if (r2 == 0) {
                                gapComposer3.startReplaceGroup(-1177677167);
                                Colors colors4 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors4 == null) {
                                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                j = colors4.semantic.icon.standard;
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(-1177682034);
                                gapComposer3.end(false);
                                j = r2.value;
                            }
                            ArrayList arrayList3 = arrayList;
                            arrayList3.add(new AvatarEntry(str2, j, num, r19, avatar.accessibility_value, r21, null, null, 192));
                            it2 = it;
                            arrayList2 = arrayList3;
                            i3 = i4;
                            th2 = th4;
                        }
                        th = th2;
                        persistentList = Tags.toPersistentList(CollectionsKt.reversed(arrayList2));
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-323096302);
                        List take2 = CollectionsKt.take(avatarElement.ui_avatars, 3);
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take2, 10));
                        Iterator it3 = take2.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(AvatarsKt.toAvatarEntry((UiAvatar) it3.next(), null, gapComposer3, 1));
                        }
                        persistentList = Tags.toPersistentList(CollectionsKt.reversed(arrayList4));
                        gapComposer3.end(false);
                        th = null;
                    }
                    AbstractPersistentList abstractPersistentList = persistentList;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw th;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (avatarElement.avatars.size() == 2) {
                        gapComposer3.startReplaceGroup(-1488744080);
                        FormBlocker.Element.AvatarElement.Avatar_Size avatar_Size = avatarElement.avatars_size;
                        if (avatar_Size == null) {
                            avatar_Size = FormBlocker.Element.AvatarElement.Avatar_Size.LARGE;
                        }
                        int i8 = ArcadeFormBadgedAvatar.WhenMappings.$EnumSwitchMapping$0[avatar_Size.ordinal()];
                        if (i8 == 1) {
                            diagonalAvatarValues = DiagonalAvatarValues.Size48;
                        } else if (i8 == 2) {
                            diagonalAvatarValues = DiagonalAvatarValues.Size64;
                        } else {
                            if (i8 != 3) {
                                throw new RuntimeException(avatarElement.avatars_size + " not supported");
                            }
                            diagonalAvatarValues = DiagonalAvatarValues.Size96;
                        }
                        gapComposer = gapComposer3;
                        AudioConfigUtil.DiagonalStackedAvatars(diagonalAvatarValues, (AvatarEntry) abstractPersistentList.get(0), (AvatarEntry) abstractPersistentList.get(1), null, gapComposer, 0, 8);
                        gapComposer.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1488088337);
                        FormBlocker.Element.AvatarElement.Avatar_Size avatar_Size2 = avatarElement.avatars_size;
                        if (avatar_Size2 == null) {
                            avatar_Size2 = FormBlocker.Element.AvatarElement.Avatar_Size.LARGE;
                        }
                        int i9 = ArcadeFormBadgedAvatar.WhenMappings.$EnumSwitchMapping$0[avatar_Size2.ordinal()];
                        if (i9 == 1) {
                            avatarSize = AvatarSize.Size48;
                        } else if (i9 == 2) {
                            avatarSize = AvatarSize.Size64;
                        } else {
                            if (i9 != 3) {
                                throw new RuntimeException(avatarElement.avatars_size + " not supported");
                            }
                            avatarSize = AvatarSize.Size96;
                        }
                        zzabw.HorizontalStackedAvatars(avatarSize, abstractPersistentList, null, gapComposer3, 0, 4);
                        gapComposer = gapComposer3;
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArcadeFormBadgedAvatar$$ExternalSyntheticLambda0(ArcadeFormBadgedAvatar arcadeFormBadgedAvatar, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = arcadeFormBadgedAvatar;
    }
}
