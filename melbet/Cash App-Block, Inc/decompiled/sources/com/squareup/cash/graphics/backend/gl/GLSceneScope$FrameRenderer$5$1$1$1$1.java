package com.squareup.cash.graphics.backend.gl;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.opengl.GLES20;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.core.content.FileProvider;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.local.presenters.brand.menu.FreeTextInput;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemModifierList;
import app.cash.local.primitives.MenuItemModifierListToken;
import app.cash.local.primitives.Modifier;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import com.google.common.math.DoubleUtils;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewModel;
import com.squareup.cash.graphics.backend.engine.CameraState;
import com.squareup.cash.graphics.backend.gl.core.GLTexture;
import com.squareup.cash.graphics.backend.gl.core.ObjMesh;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.graphics.backend.math.Matrix4;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final class GLSceneScope$FrameRenderer$5$1$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $lights;
    public final /* synthetic */ Object $mesh;
    public final /* synthetic */ Object $model;
    public final /* synthetic */ Object $modelViewNormal;
    public final /* synthetic */ Object $modelViewProjection;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object $this_with;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLSceneScope$FrameRenderer$5$1$1$1$1(List list, LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter, CartEntryWithQuantity cartEntryWithQuantity, MenuItem menuItem, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, SnapshotStateMap snapshotStateMap3, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$lights = list;
        this.$this_with = localMenuItemDetailsPresenter;
        this.$mesh = cartEntryWithQuantity;
        this.$model = menuItem;
        this.$modelViewNormal = snapshotStateMap;
        this.$modelViewProjection = snapshotStateMap2;
        this.this$0 = snapshotStateMap3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$lights;
        Object obj3 = this.this$0;
        Object obj4 = this.$modelViewProjection;
        Object obj5 = this.$modelViewNormal;
        Object obj6 = this.$model;
        Object obj7 = this.$mesh;
        switch (i) {
            case 0:
                return new GLSceneScope$FrameRenderer$5$1$1$1$1((PBRMaterial.PBRMaterialInstance) this.$this_with, (ObjMesh) obj7, (Matrix4) obj6, (Matrix4) obj5, (Matrix4) obj4, (GLSceneScope) obj3, (List) obj2, continuation, 0);
            case 1:
                return new GLSceneScope$FrameRenderer$5$1$1$1$1((List) obj2, (LocalMenuItemDetailsPresenter) this.$this_with, (CartEntryWithQuantity) obj7, (MenuItem) obj6, (SnapshotStateMap) obj5, (SnapshotStateMap) obj4, (SnapshotStateMap) obj3, continuation);
            case 2:
                GLSceneScope$FrameRenderer$5$1$1$1$1 gLSceneScope$FrameRenderer$5$1$1$1$1 = new GLSceneScope$FrameRenderer$5$1$1$1$1((Money) obj7, (BitcoinDisplayUnits) obj6, (Money) obj5, (Boolean) obj4, continuation, (StuckPlayerDetector) obj3, (MutableState) obj2);
                gLSceneScope$FrameRenderer$5$1$1$1$1.$this_with = obj;
                return gLSceneScope$FrameRenderer$5$1$1$1$1;
            case 3:
                return new GLSceneScope$FrameRenderer$5$1$1$1$1((String) this.$this_with, (Context) obj7, (Function1) obj6, (ManagedActivityResultLauncher) obj5, (ManagedActivityResultLauncher) obj4, (MutableState) obj3, (MutableState) obj2, continuation, 3);
            case 4:
                return new GLSceneScope$FrameRenderer$5$1$1$1$1((Function1) this.$this_with, (Element) obj7, (MutableState) obj6, (MutableFloatState) obj5, (MutableFloatState) obj4, (MutableState) obj3, (MutableFloatState) obj2, continuation, 4);
            default:
                return new GLSceneScope$FrameRenderer$5$1$1$1$1((CardSchemePresenter) this.$this_with, (MutableState) obj7, (MutableState) obj6, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (State) obj2, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((GLSceneScope$FrameRenderer$5$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((GLSceneScope$FrameRenderer$5$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((GLSceneScope$FrameRenderer$5$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((GLSceneScope$FrameRenderer$5$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((GLSceneScope$FrameRenderer$5$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((GLSceneScope$FrameRenderer$5$1$1$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        List listOfNotNull;
        List list;
        List<CartEntry.ModifierFreeEntry> list2;
        CartEntry cartEntry;
        SortedSet sortedSet;
        CartEntry cartEntry2;
        SortedSet sortedSet2;
        CartEntry cartEntry3;
        List list3;
        CartEntry.ModifierSelection modifierSelection;
        List list4;
        CartEntry cartEntry4;
        int i = this.$r8$classId;
        String str2 = null;
        Object obj2 = this.$modelViewProjection;
        Object obj3 = this.$mesh;
        Object obj4 = this.this$0;
        Object obj5 = this.$lights;
        Object obj6 = this.$modelViewNormal;
        Object obj7 = this.$model;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PBRMaterial.PBRMaterialInstance pBRMaterialInstance = (PBRMaterial.PBRMaterialInstance) this.$this_with;
                ObjMesh objMesh = (ObjMesh) obj3;
                objMesh.getClass();
                int[] iArr = objMesh.indexVertexBuffer;
                Matrix4 matrix4 = (Matrix4) obj7;
                Matrix4 matrix42 = (Matrix4) obj6;
                Matrix4 matrix43 = (Matrix4) obj2;
                CameraState cameraState = ((GLSceneScope) obj4).cameraState;
                List list5 = (List) obj5;
                int i2 = pBRMaterialInstance.uvLoc;
                int i3 = pBRMaterialInstance.bitangentLoc;
                int i4 = pBRMaterialInstance.tangentLoc;
                int i5 = pBRMaterialInstance.normalLoc;
                int i6 = pBRMaterialInstance.positionLoc;
                float[] fArr = pBRMaterialInstance.lightPositions;
                float[] fArr2 = pBRMaterialInstance.lightColors;
                matrix4.getClass();
                matrix42.getClass();
                matrix43.getClass();
                cameraState.getClass();
                list5.getClass();
                int i7 = pBRMaterialInstance.programLoc;
                GLES20.glUseProgram(i7);
                DoubleUtils.checkGlError("glUseProgram");
                GLES20.glUniformMatrix4fv(pBRMaterialInstance.modelMatrixLoc, 1, false, matrix4.matrix, 0);
                DoubleUtils.checkGlError("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(pBRMaterialInstance.mvpMatrixLoc, 1, false, matrix43.matrix, 0);
                DoubleUtils.checkGlError("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(pBRMaterialInstance.normalMatrixLoc, 1, false, matrix42.matrix, 0);
                DoubleUtils.checkGlError("glUniformMatrix4fv");
                GLES20.glUniform3fv(pBRMaterialInstance.cameraLoc, 1, cameraState.position.vector, 0);
                IntProgressionIterator it = RangesKt___RangesKt.until(0, 15).iterator();
                while (it.hasNext) {
                    int nextInt = it.nextInt();
                    Pair pair = (Pair) CollectionsKt.getOrNull(nextInt / 3, list5);
                    if (pair != null) {
                        List list6 = (List) pair.first;
                        Vector4 vector4 = (Vector4) pair.second;
                        int i8 = nextInt % 3;
                        fArr2[nextInt] = ((Number) list6.get(i8)).floatValue();
                        fArr[nextInt] = vector4.vector[i8];
                    }
                }
                GLES20.glUniform3fv(pBRMaterialInstance.lightPositionsLoc, 5, fArr, 0);
                GLES20.glUniform3fv(pBRMaterialInstance.lightColorsLoc, 5, fArr2, 0);
                for (Map.Entry entry : pBRMaterialInstance.colorProperties.entrySet()) {
                    String str3 = (String) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    str3.getClass();
                    int glGetUniformLocation = GLES20.glGetUniformLocation(i7, str3);
                    DoubleUtils.checkLocation(glGetUniformLocation, str3);
                    GLES20.glUniform3f(glGetUniformLocation, Color.red(intValue) / 255.0f, Color.green(intValue) / 255.0f, Color.blue(intValue) / 255.0f);
                }
                for (Map.Entry entry2 : pBRMaterialInstance.floatProperties.entrySet()) {
                    String str4 = (String) entry2.getKey();
                    float floatValue = ((Number) entry2.getValue()).floatValue();
                    str4.getClass();
                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(i7, str4);
                    DoubleUtils.checkLocation(glGetUniformLocation2, str4);
                    GLES20.glUniform1f(glGetUniformLocation2, floatValue);
                }
                for (Map.Entry entry3 : pBRMaterialInstance.float3Properties.entrySet()) {
                    String str5 = (String) entry3.getKey();
                    List list7 = (List) entry3.getValue();
                    str5.getClass();
                    int glGetUniformLocation3 = GLES20.glGetUniformLocation(i7, str5);
                    DoubleUtils.checkLocation(glGetUniformLocation3, str5);
                    if (list7.size() >= 3) {
                        GLES20.glUniform3f(glGetUniformLocation3, ((Number) list7.get(0)).floatValue(), ((Number) list7.get(1)).floatValue(), ((Number) list7.get(2)).floatValue());
                    }
                }
                int i9 = 0;
                for (Map.Entry entry4 : pBRMaterialInstance.textureProperties.entrySet()) {
                    String str6 = (String) entry4.getKey();
                    GLTexture gLTexture = (GLTexture) entry4.getValue();
                    str6.getClass();
                    int glGetUniformLocation4 = GLES20.glGetUniformLocation(i7, str6);
                    DoubleUtils.checkLocation(glGetUniformLocation4, str6);
                    GLES20.glUniform1i(glGetUniformLocation4, i9);
                    GLES20.glActiveTexture(33984 + i9);
                    gLTexture.getClass();
                    GLES20.glBindTexture(3553, gLTexture.texture);
                    i9++;
                }
                GLES20.glBindBuffer(34963, iArr[0]);
                GLES20.glBindBuffer(34962, iArr[1]);
                GLES20.glEnableVertexAttribArray(i6);
                DoubleUtils.checkGlError("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(pBRMaterialInstance.positionLoc, 3, 5126, false, 56, 0);
                DoubleUtils.checkGlError("glVertexAttribPointer");
                GLES20.glEnableVertexAttribArray(i5);
                DoubleUtils.checkGlError("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(pBRMaterialInstance.normalLoc, 3, 5126, false, 56, 12);
                DoubleUtils.checkGlError("glVertexAttribPointer");
                GLES20.glEnableVertexAttribArray(i4);
                DoubleUtils.checkGlError("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(pBRMaterialInstance.tangentLoc, 3, 5126, false, 56, 24);
                DoubleUtils.checkGlError("glVertexAttribPointer");
                GLES20.glEnableVertexAttribArray(i3);
                DoubleUtils.checkGlError("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(pBRMaterialInstance.bitangentLoc, 3, 5126, false, 56, 36);
                DoubleUtils.checkGlError("glVertexAttribPointer");
                GLES20.glEnableVertexAttribArray(i2);
                DoubleUtils.checkGlError("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(pBRMaterialInstance.uvLoc, 2, 5126, false, 56, 48);
                DoubleUtils.checkGlError("glVertexAttribPointer");
                GLES20.glDrawElements(4, objMesh.indexSize, 5125, 0);
                DoubleUtils.checkGlError("glDrawElements");
                GLES20.glDisableVertexAttribArray(i6);
                GLES20.glDisableVertexAttribArray(i5);
                GLES20.glDisableVertexAttribArray(i4);
                GLES20.glDisableVertexAttribArray(i3);
                GLES20.glDisableVertexAttribArray(i2);
                GLES20.glBindBuffer(34963, 0);
                GLES20.glBindBuffer(34962, 0);
                for (int i10 = 0; i10 < i9; i10++) {
                    GLES20.glActiveTexture(i10 + 33984);
                    GLES20.glBindTexture(3553, 0);
                }
                GLES20.glUseProgram(0);
                break;
            case 1:
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj6;
                MenuItem menuItem = (MenuItem) obj7;
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj2;
                SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) obj4;
                LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter = (LocalMenuItemDetailsPresenter) this.$this_with;
                CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) obj3;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list8 = (List) obj5;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list8.iterator();
                while (it2.hasNext()) {
                    MenuItemModifierList.InputType inputType = ((MenuItemModifierList) it2.next()).inputType;
                    MenuItemModifierList.InputType.SelectFromList selectFromList = inputType instanceof MenuItemModifierList.InputType.SelectFromList ? (MenuItemModifierList.InputType.SelectFromList) inputType : null;
                    if (selectFromList != null) {
                        arrayList.add(selectFromList);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ArrayList arrayList3 = ((MenuItemModifierList.InputType.SelectFromList) it3.next()).modifiers;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj8 : arrayList3) {
                        if (((Modifier) obj8).selectedByDefault) {
                            arrayList4.add(obj8);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((Modifier) it4.next()).token);
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList5, arrayList2);
                }
                LocalMenuItemDetailsScreen.Mode mode = localMenuItemDetailsPresenter.screen.mode;
                if (mode instanceof LocalMenuItemDetailsScreen.Mode.Add) {
                    LocalMenuItemDetailsScreen.Mode.Add add = (LocalMenuItemDetailsScreen.Mode.Add) mode;
                    String str7 = add.selectedVariant;
                    if (str7 == null) {
                        str7 = null;
                    }
                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(str7);
                    list = add.selectedModifiers;
                    list2 = add.selectedTextModifiers;
                } else if (mode instanceof LocalMenuItemDetailsScreen.Mode.Update) {
                    LocalMenuItemDetailsScreen.Mode.Update update = (LocalMenuItemDetailsScreen.Mode.Update) mode;
                    String str8 = update.selectedVariant;
                    if (str8 == null) {
                        str8 = null;
                    }
                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(str8);
                    list = update.selectedModifiers;
                    list2 = update.selectedTextModifiers;
                } else if (!(mode instanceof LocalMenuItemDetailsScreen.Mode.EditFromCart)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    if (cartEntryWithQuantity == null || (cartEntry3 = cartEntryWithQuantity.getCartEntry()) == null || (str = cartEntry3.variationToken) == null) {
                        str = null;
                    }
                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(str);
                    List list9 = (cartEntryWithQuantity == null || (cartEntry2 = cartEntryWithQuantity.getCartEntry()) == null || (sortedSet2 = cartEntry2.modifierSelections) == null) ? null : CollectionsKt.toList(sortedSet2);
                    if (list9 == null) {
                        list9 = EmptyList.INSTANCE;
                    }
                    list = list9;
                    list2 = (cartEntryWithQuantity == null || (cartEntry = cartEntryWithQuantity.getCartEntry()) == null || (sortedSet = cartEntry.freeTextEntries) == null) ? null : CollectionsKt.toList(sortedSet);
                    if (list2 == null) {
                        list2 = EmptyList.INSTANCE;
                    }
                }
                List<CartEntry.ModifierSelection> list10 = list;
                Iterator it5 = CollectionsKt.plus((Iterable) listOfNotNull, (Collection) arrayList2).iterator();
                while (it5.hasNext()) {
                    String str9 = (String) it5.next();
                    LocalMenuItemDetailsPresenter.access$performSelection(localMenuItemDetailsPresenter, (List) obj5, (MenuItem) obj7, (SnapshotStateMap) obj6, str9, null, cartEntryWithQuantity != null ? cartEntryWithQuantity.getCartEntry() : null);
                    LocalMenuItemDetailsPresenter.validateSelections(list8, menuItem, snapshotStateMap, snapshotStateMap2, str9);
                }
                for (CartEntry.ModifierSelection modifierSelection2 : list10) {
                    List list11 = (List) obj5;
                    MenuItem menuItem2 = (MenuItem) obj7;
                    SnapshotStateMap snapshotStateMap4 = (SnapshotStateMap) obj6;
                    String str10 = modifierSelection2.selectionToken;
                    Integer num = modifierSelection2.quantity;
                    if (cartEntryWithQuantity != null) {
                        list3 = list2;
                        modifierSelection = modifierSelection2;
                        list4 = list11;
                        cartEntry4 = cartEntryWithQuantity.getCartEntry();
                    } else {
                        list3 = list2;
                        modifierSelection = modifierSelection2;
                        list4 = list11;
                        cartEntry4 = null;
                    }
                    LocalMenuItemDetailsPresenter.access$performSelection(localMenuItemDetailsPresenter, list4, menuItem2, snapshotStateMap4, str10, num, cartEntry4);
                    LocalMenuItemDetailsPresenter.validateSelections(list8, menuItem, snapshotStateMap, snapshotStateMap2, modifierSelection.selectionToken);
                    list2 = list3;
                }
                for (CartEntry.ModifierFreeEntry modifierFreeEntry : list2) {
                    snapshotStateMap3.put(new MenuItemModifierListToken(modifierFreeEntry.listToken), new FreeTextInput(modifierFreeEntry.input, null));
                    LocalMenuItemDetailsPresenter.m1215validateFreeTextEntriesN9MCIc4(list8, snapshotStateMap3, snapshotStateMap2, modifierFreeEntry.listToken);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Money money = (Money) obj3;
                Money money2 = (Money) obj6;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj4;
                String formatBitcoinWithSymbolPrefix$default = RealBitcoinFormatter.formatBitcoinWithSymbolPrefix$default((RealBitcoinFormatter) stuckPlayerDetector.clock, (BitcoinDisplayUnits) obj7, money, booleanValue);
                Pair pair2 = booleanValue ? new Pair(((MoneyFormatter) stuckPlayerDetector.stuckSuppressedDetector).format(money2), formatBitcoinWithSymbolPrefix$default) : new Pair(formatBitcoinWithSymbolPrefix$default, ((MoneyFormatter) stuckPlayerDetector.stuckPlayingNotEndingDetector).format(money2));
                String str11 = (String) pair2.first;
                String str12 = (String) pair2.second;
                MutableState mutableState = (MutableState) obj5;
                if (booleanValue) {
                    money = money2;
                }
                mutableState.setValue(new BitcoinBalanceWidgetViewModel(str11, str12, ((BitcoinBalanceWidgetViewModel) mutableState.getValue()).sectionTitle, money.amount));
                break;
            case 3:
                Context context = (Context) obj3;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str13 = (String) this.$this_with;
                if (str13 == null) {
                    break;
                } else {
                    Uri uriForFile = FileProvider.getUriForFile(context, Recorder$$ExternalSyntheticOutline2.m$1(context.getPackageName(), ".fileprovider"), new File(str13));
                    ((Function1) obj7).invoke(MoneybotChatViewEvent.CameraCapturePathConsumed.INSTANCE);
                    ((MutableState) obj4).setValue(uriForFile);
                    if (Strings.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
                        uriForFile.getClass();
                        ((ManagedActivityResultLauncher) obj6).launch(uriForFile);
                    } else {
                        ((MutableState) obj5).setValue(Boolean.TRUE);
                        ((ManagedActivityResultLauncher) obj2).launch("android.permission.CAMERA");
                    }
                    break;
                }
            case 4:
                MutableState mutableState2 = (MutableState) obj4;
                MutableFloatState mutableFloatState = (MutableFloatState) obj6;
                Element element = (Element) obj3;
                Function1 function1 = (Function1) this.$this_with;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Boolean bool = (Boolean) ((MutableState) obj7).getValue();
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    function1.invoke(new PersonalizePaymentViewEvent.TransformationStarted(element.getId()));
                } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
                    ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj2)).setFloatValue(parcelableSnapshotMutableFloatState.getFloatValue());
                    function1.invoke(new PersonalizePaymentViewEvent.TransformationEnded(Float.intBitsToFloat((int) (((Offset) mutableState2.getValue()).packedValue >> 32)), Float.intBitsToFloat((int) (((Offset) mutableState2.getValue()).packedValue & BodyPartID.bodyIdMax)), ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj5)).getFloatValue(), parcelableSnapshotMutableFloatState.getFloatValue(), element.getId()));
                }
                break;
            default:
                MutableState mutableState3 = (MutableState) obj7;
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) this.$this_with;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = cardSchemePresenter.copyAnimationTrigger$delegate;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState4 = (MutableState) obj4;
                MutableState mutableState5 = (MutableState) obj3;
                if (((Boolean) mutableState5.getValue()).booleanValue()) {
                    String str14 = (String) mutableState3.getValue();
                    mutableState5.setValue(Boolean.FALSE);
                    mutableState3.setValue(null);
                    str2 = str14;
                } else {
                    CashAppTag cashAppTag = (CashAppTag) CollectionsKt.getOrNull(((Number) ((MutableState) obj2).getValue()).intValue() - 1, (List) ((MutableState) obj6).getValue());
                    if (cashAppTag != null) {
                        str2 = cashAppTag.deviceId;
                    }
                }
                mutableState4.setValue(str2);
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                String str15 = (String) ((State) obj5).getValue();
                if (str15 != null) {
                    cardSchemePresenter.copyToClipboard(str15);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLSceneScope$FrameRenderer$5$1$1$1$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_with = obj;
        this.$mesh = obj2;
        this.$model = obj3;
        this.$modelViewNormal = obj4;
        this.$modelViewProjection = obj5;
        this.this$0 = obj6;
        this.$lights = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLSceneScope$FrameRenderer$5$1$1$1$1(Money money, BitcoinDisplayUnits bitcoinDisplayUnits, Money money2, Boolean bool, Continuation continuation, StuckPlayerDetector stuckPlayerDetector, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$mesh = money;
        this.$model = bitcoinDisplayUnits;
        this.$modelViewNormal = money2;
        this.$modelViewProjection = bool;
        this.this$0 = stuckPlayerDetector;
        this.$lights = mutableState;
    }
}
