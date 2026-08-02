package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.SharedPreferences;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.autofill.AndroidContentDataType;
import androidx.compose.ui.autofill.AndroidFillableData;
import androidx.compose.ui.autofill.AutofillApi26Helper;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.borrow.ui.util.ArcadeThemeKt;
import com.squareup.cash.observability.backend.api.BuildVariantTag;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class zzadx {
    public static final String getUnifiedNameBuildVariantTag(String str, String str2) {
        return ((str.equals("internal") && str2.equals("release")) ? BuildVariantTag.ProductionInternal : (str.equals("production") && str2.equals("release")) ? BuildVariantTag.ProductionRelease : BuildVariantTag.StagingDebug).unifiedName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0364 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void populate(ViewStructure viewStructure, LayoutNode layoutNode, AutofillId autofillId, String str, RectManager rectManager) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean z;
        ToggleableState toggleableState;
        AnnotatedString annotatedString;
        AndroidFillableData androidFillableData;
        Role role;
        AndroidContentDataType androidContentDataType;
        boolean z2;
        ContentType contentType;
        Boolean bool;
        boolean z3;
        Integer num;
        int i2;
        List list;
        Integer valueOf;
        boolean z4;
        boolean z5;
        String m3425toLegacyClassNameV4PA4sw;
        String[] contentHints;
        String[] contentHints2;
        MutableScatterMap mutableScatterMap;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        MutableScatterMap mutableScatterMap2;
        ToggleableState toggleableState2;
        AnnotatedString annotatedString2;
        AndroidFillableData androidFillableData2;
        Role role2;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsActions.GetTextLayoutResult;
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        int i4 = 8;
        if (semanticsConfiguration == null || (mutableScatterMap2 = semanticsConfiguration.props) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            z = true;
            toggleableState = null;
            annotatedString = null;
            androidFillableData = null;
            role = null;
            androidContentDataType = null;
            z2 = false;
            contentType = null;
            bool = null;
            z3 = false;
            num = null;
        } else {
            Object[] objArr3 = mutableScatterMap2.keys;
            j = 128;
            Object[] objArr4 = mutableScatterMap2.values;
            long[] jArr3 = mutableScatterMap2.metadata;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                int i5 = 0;
                androidContentDataType = null;
                j2 = 255;
                z2 = false;
                toggleableState2 = null;
                annotatedString2 = null;
                androidFillableData2 = null;
                contentType = null;
                bool = null;
                role2 = null;
                z3 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                SemanticsPropertyKey semanticsPropertyKey3 = (SemanticsPropertyKey) obj;
                                if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.ContentDataType)) {
                                    obj2.getClass();
                                    androidContentDataType = (AndroidContentDataType) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.ContentDescription)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) CollectionsKt.firstOrNull((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.ContentType)) {
                                    obj2.getClass();
                                    contentType = (ContentType) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.FillableData)) {
                                    obj2.getClass();
                                    androidFillableData2 = (AndroidFillableData) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.EditableText)) {
                                    obj2.getClass();
                                    annotatedString2 = (AnnotatedString) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.Focused)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.MaxTextLength)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.Password)) {
                                    z3 = true;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.IsSensitiveData)) {
                                    obj2.getClass();
                                    z = ((Boolean) obj2).booleanValue();
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.Role)) {
                                    obj2.getClass();
                                    role2 = (Role) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.Selected)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsProperties.ToggleableState)) {
                                    obj2.getClass();
                                    toggleableState2 = (ToggleableState) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsActions.OnClick)) {
                                    viewStructure.setClickable(true);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsActions.OnLongClick)) {
                                    viewStructure.setLongClickable(true);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsActions.RequestFocus)) {
                                    viewStructure.setFocusable(true);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey3, SemanticsActions.SetText)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                z = true;
                androidContentDataType = null;
                z2 = false;
                toggleableState2 = null;
                annotatedString2 = null;
                androidFillableData2 = null;
                contentType = null;
                bool = null;
                role2 = null;
                z3 = false;
                num = null;
            }
            toggleableState = toggleableState2;
            annotatedString = annotatedString2;
            androidFillableData = androidFillableData2;
            role = role2;
        }
        SemanticsConfiguration semanticsConfiguration2 = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration2 != null && semanticsConfiguration2.isMergingSemanticsOfDescendants && !semanticsConfiguration2.isClearingSemantics) {
            semanticsConfiguration2 = semanticsConfiguration2.copy();
            MutableObjectList mutableObjectList = new MutableObjectList(((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).vector.size);
            mutableObjectList.addAll(layoutNode.getChildren$ui());
            while (mutableObjectList.isNotEmpty()) {
                LayoutNode layoutNode2 = (LayoutNode) mutableObjectList.removeAt(mutableObjectList._size - 1);
                SemanticsConfiguration semanticsConfiguration3 = layoutNode2.getSemanticsConfiguration();
                if (semanticsConfiguration3 != null && !semanticsConfiguration3.isMergingSemanticsOfDescendants) {
                    semanticsConfiguration2.mergeChild$ui(semanticsConfiguration3);
                    if (!semanticsConfiguration3.isClearingSemantics) {
                        mutableObjectList.addAll(layoutNode2.getChildren$ui());
                    }
                }
            }
        }
        if (semanticsConfiguration2 == null || (mutableScatterMap = semanticsConfiguration2.props) == null) {
            i2 = 1;
        } else {
            Object[] objArr5 = mutableScatterMap.keys;
            Object[] objArr6 = mutableScatterMap.values;
            long[] jArr4 = mutableScatterMap.metadata;
            int length2 = jArr4.length - 2;
            i2 = 1;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr5[i14];
                                Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                SemanticsPropertyKey semanticsPropertyKey4 = (SemanticsPropertyKey) obj3;
                                objArr2 = objArr5;
                                if (Intrinsics.areEqual(semanticsPropertyKey4, SemanticsProperties.Disabled)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey4, SemanticsProperties.Text)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
                Integer valueOf2 = Integer.valueOf(layoutNode.semanticsId);
                if (layoutNode.getParent$ui() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = androidContentDataType == null ? Integer.valueOf(androidContentDataType.androidAutofillType) : z2 ? Integer.valueOf(i2) : toggleableState != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (annotatedString != null) {
                    viewStructure.setAutofillValue(AutofillApi26Helper.getAutofillTextValue(annotatedString.text));
                }
                if (androidFillableData != null) {
                    viewStructure.setAutofillValue(androidFillableData.autofillValue);
                }
                if (contentType != null && (contentHints2 = Countries.getContentHints(contentType)) != null) {
                    viewStructure.setAutofillHints(contentHints2);
                }
                boolean z6 = i2;
                rectManager.rects.withRect(layoutNode.semanticsId, new DecorativeViewFactory.AnonymousClass2(viewStructure, z6 ? 1 : 0));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (toggleableState == null) {
                    viewStructure.setCheckable(z6);
                    viewStructure.setChecked(toggleableState == ToggleableState.On);
                } else if (bool != null && (role == null || role.value != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                ContentType.Companion.getClass();
                String str2 = (String) ArraysKt___ArraysKt.first(Countries.getContentHints(ContentType.Companion.Password));
                if (contentType != null || (contentHints = Countries.getContentHints(contentType)) == null) {
                    z4 = true;
                } else {
                    z4 = true;
                    if (ArraysKt___ArraysKt.contains(contentHints, str2)) {
                        z5 = true;
                        boolean z7 = (!z3 || z5) ? z4 : false;
                        viewStructure.setDataIsSensitive((!z7 || z) ? z4 : false);
                        viewStructure.setVisibility(((NodeCoordinator) layoutNode.nodes.outerCoordinator).isTransparent() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = "";
                            for (int i15 = 0; i15 < size; i15++) {
                                str3 = CameraState$Type$EnumUnboxingLocalUtility.m(Boxes$$ExternalSyntheticOutline1.m(str3), ((AnnotatedString) list.get(i15)).text, '\n');
                            }
                            viewStructure.setText(str3);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).isEmpty() && role != null && (m3425toLegacyClassNameV4PA4sw = ArcadeThemeKt.m3425toLegacyClassNameV4PA4sw(role.value)) != null) {
                            viewStructure.setClassName(m3425toLegacyClassNameV4PA4sw);
                        }
                        if (z2) {
                            viewStructure.setClassName("android.widget.EditText");
                            if (num != null) {
                                viewStructure.setMaxTextLength(num.intValue());
                            }
                            if (z7) {
                                viewStructure.setInputType(EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z5 = false;
                if (z3) {
                }
                viewStructure.setDataIsSensitive((!z7 || z) ? z4 : false);
                viewStructure.setVisibility(((NodeCoordinator) layoutNode.nodes.outerCoordinator).isTransparent() ? 4 : 0);
                if (list != null) {
                }
                if (((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).isEmpty()) {
                    viewStructure.setClassName(m3425toLegacyClassNameV4PA4sw);
                }
                if (z2) {
                }
            }
        }
        list = null;
        Integer valueOf22 = Integer.valueOf(layoutNode.semanticsId);
        if (layoutNode.getParent$ui() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (androidContentDataType == null) {
        }
        if (valueOf != null) {
        }
        if (annotatedString != null) {
        }
        if (androidFillableData != null) {
        }
        if (contentType != null) {
            viewStructure.setAutofillHints(contentHints2);
        }
        boolean z62 = i2;
        rectManager.rects.withRect(layoutNode.semanticsId, new DecorativeViewFactory.AnonymousClass2(viewStructure, z62 ? 1 : 0));
        if (bool != null) {
        }
        if (toggleableState == null) {
        }
        ContentType.Companion.getClass();
        String str22 = (String) ArraysKt___ArraysKt.first(Countries.getContentHints(ContentType.Companion.Password));
        if (contentType != null) {
        }
        z4 = true;
        z5 = false;
        if (z3) {
        }
        viewStructure.setDataIsSensitive((!z7 || z) ? z4 : false);
        viewStructure.setVisibility(((NodeCoordinator) layoutNode.nodes.outerCoordinator).isTransparent() ? 4 : 0);
        if (list != null) {
        }
        if (((MutableVector.MutableVectorList) layoutNode.getChildren$ui()).isEmpty()) {
        }
        if (z2) {
        }
    }

    public static SharedPreferencesKeyValue provideHasSeenStablecoinReceiveOnboarding(SharedPreferences sharedPreferences) {
        return Room.BooleanKeyValue(sharedPreferences, "has_seen_stablecoin_receive_onboarding", false, false);
    }

    public static SharedPreferencesKeyValue provideHasSeenStablecoinWithdrawalOnboarding(SharedPreferences sharedPreferences) {
        return Room.BooleanKeyValue(sharedPreferences, "has_seen_stablecoin_withdrawal_onboarding", false, false);
    }

    public static SharedPreferencesKeyValue providePerformanceSummarySubtitle(SharedPreferences sharedPreferences) {
        return Room.BooleanKeyValue(sharedPreferences, "btc_performance_summary_subtitle", true, false);
    }

    public static SharedPreferencesKeyValue provideStackingToolsLearnMore(SharedPreferences sharedPreferences) {
        return Room.BooleanKeyValue(sharedPreferences, "btc_stacking_tools_learn_more", true, false);
    }
}
