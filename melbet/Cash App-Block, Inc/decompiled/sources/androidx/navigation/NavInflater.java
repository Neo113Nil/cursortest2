package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.widget.TintInfo;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.core.os.BundleKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda7;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.sheet.UserDismissMode;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$17$1;
import com.squareup.cash.transfers.views.shared.TransferSheetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.views.shared.TransferSheetKt$TransferSheet$4$1;
import com.squareup.cash.ui.AlertBannerKt;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$registerInBackground$1;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class NavInflater {
    public static final ThreadLocal sTmpValue = new ThreadLocal();
    public final Context context;
    public final NavigatorProvider navigatorProvider;

    public abstract class Companion {
        /* JADX WARN: Removed duplicated region for block: B:104:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02c6  */
        /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void TransferSheet(Object obj, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, boolean z, UserDismissMode userDismissMode, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
            boolean z2;
            int i3;
            int i4;
            int i5;
            Function1 function13;
            ComposableLambdaImpl composableLambdaImpl2;
            GapComposer gapComposer;
            UserDismissMode userDismissMode2;
            RecomposeScopeImpl endRestartGroup;
            int i6;
            UserDismissMode userDismissMode3;
            CoroutineScope coroutineScope;
            Object obj2;
            boolean z3;
            MutableState mutableState;
            boolean z4;
            boolean z5;
            Object obj3;
            obj.getClass();
            function0.getClass();
            function1.getClass();
            function12.getClass();
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startRestartGroup(-152279958);
            int i7 = i | (gapComposer2.changed(obj) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16) | (gapComposer2.changedInstance(function12) ? 2048 : 1024) | (gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(function03) ? PKIFailureInfo.unsupportedVersion : 65536);
            int i8 = i2 & 64;
            if (i8 != 0) {
                i7 |= 1572864;
            } else if ((i & 1572864) == 0) {
                z2 = z;
                i7 |= gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                i3 = i2 & 128;
                if (i3 == 0) {
                    i4 = 12582912;
                } else {
                    i4 = gapComposer2.changed(userDismissMode == null ? -1 : userDismissMode.ordinal()) ? 8388608 : 4194304;
                }
                i5 = i7 | i4;
                if (gapComposer2.shouldExecute(i5 & 1, (38347923 & i5) == 38347922)) {
                    function13 = function1;
                    composableLambdaImpl2 = composableLambdaImpl;
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    userDismissMode2 = userDismissMode;
                } else {
                    boolean z6 = i8 != 0 ? false : z2;
                    UserDismissMode userDismissMode4 = i3 != 0 ? UserDismissMode.All : userDismissMode;
                    RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer2, 0, 1);
                    rememberSheetState.getClass();
                    userDismissMode4.getClass();
                    rememberSheetState.userDismissMode$delegate.setValue(userDismissMode4);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj4 = Composer.Companion.Empty;
                    if (rememberedValue == obj4) {
                        rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue;
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(Reflection.factory.getOrCreateKotlinClass(obj.getClass()), gapComposer2);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj4) {
                        rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue2;
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == obj4) {
                        rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    MutableState mutableState3 = (MutableState) rememberedValue3;
                    SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = (SheetPeekPosition$FixedHeight) function12.invoke(obj);
                    boolean z7 = sheetPeekPosition$FixedHeight != null;
                    function13 = function1;
                    boolean booleanValue = ((Boolean) function13.invoke(obj)).booleanValue();
                    if (z7) {
                        i6 = i5;
                        gapComposer2.startReplaceGroup(-1085738162);
                        boolean changed = gapComposer2.changed((KClass) rememberUpdatedState.getValue());
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue4 == obj4) {
                            userDismissMode3 = userDismissMode4;
                            rememberedValue4 = Updater.derivedStateOf(new TransferSheetKt$$ExternalSyntheticLambda0(booleanValue, mutableState2, mutableState3, 0));
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        } else {
                            userDismissMode3 = userDismissMode4;
                        }
                        State state = (State) rememberedValue4;
                        KClass kClass = (KClass) rememberUpdatedState.getValue();
                        boolean changed2 = ((i6 & 3670016) == 1048576) | gapComposer2.changed(booleanValue) | gapComposer2.changed(rememberSheetState);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue5 == obj4) {
                            mutableState = mutableState2;
                            rememberedValue5 = new RealGcmRegistrar$registerInBackground$1(z6, booleanValue, rememberSheetState, mutableState, (Continuation) null);
                            z4 = z6;
                            z5 = booleanValue;
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        } else {
                            z5 = booleanValue;
                            mutableState = mutableState2;
                            z4 = z6;
                        }
                        Updater.LaunchedEffect(gapComposer2, kClass, (Function2) rememberedValue5);
                        SheetPosition settledPosition = rememberSheetState.getSettledPosition();
                        boolean changed3 = gapComposer2.changed(rememberSheetState);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue6 == obj4) {
                            obj3 = null;
                            rememberedValue6 = new TransferSheetKt$TransferSheet$4$1(rememberSheetState, mutableState, mutableState3, null, 0);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        } else {
                            obj3 = null;
                        }
                        Updater.LaunchedEffect(gapComposer2, settledPosition, (Function2) rememberedValue6);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        if (rememberedValue7 == obj4) {
                            rememberedValue7 = Updater.mutableStateOf$default(obj3);
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        }
                        MutableState mutableState4 = (MutableState) rememberedValue7;
                        Float valueOf = Float.valueOf(rememberSheetState.getExpandProgress());
                        Boolean bool = (Boolean) state.getValue();
                        bool.getClass();
                        z3 = z4;
                        boolean changed4 = ((i6 & 57344) == 16384) | gapComposer2.changed(state) | gapComposer2.changed(rememberSheetState) | gapComposer2.changed(z5) | ((i6 & 458752) == 131072);
                        Object rememberedValue8 = gapComposer2.rememberedValue();
                        if (changed4 || rememberedValue8 == obj4) {
                            coroutineScope = coroutineScope2;
                            obj2 = obj4;
                            Object shoppingWebPresenter$models$17$1 = new ShoppingWebPresenter$models$17$1(rememberSheetState, z5, function02, function03, state, mutableState4, (Continuation) null);
                            gapComposer2.updateRememberedValue(shoppingWebPresenter$models$17$1);
                            rememberedValue8 = shoppingWebPresenter$models$17$1;
                        } else {
                            coroutineScope = coroutineScope2;
                            obj2 = obj4;
                        }
                        Updater.LaunchedEffect(valueOf, bool, (Function2) rememberedValue8, gapComposer2);
                        gapComposer2.end(false);
                    } else {
                        i6 = i5;
                        userDismissMode3 = userDismissMode4;
                        coroutineScope = coroutineScope2;
                        obj2 = obj4;
                        z3 = z6;
                        gapComposer2.startReplaceGroup(-1084129448);
                        gapComposer2.end(false);
                    }
                    boolean changedInstance = gapComposer2.changedInstance(coroutineScope) | gapComposer2.changed(rememberSheetState);
                    Object rememberedValue9 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue9 == obj2) {
                        rememberedValue9 = new SheetKt$$ExternalSyntheticLambda7(coroutineScope, rememberSheetState, 2);
                        gapComposer2.updateRememberedValue(rememberedValue9);
                    }
                    Function0 function04 = (Function0) rememberedValue9;
                    boolean changedInstance2 = gapComposer2.changedInstance(coroutineScope) | gapComposer2.changed(rememberSheetState);
                    Object rememberedValue10 = gapComposer2.rememberedValue();
                    int i9 = 3;
                    if (changedInstance2 || rememberedValue10 == obj2) {
                        rememberedValue10 = new SheetKt$$ExternalSyntheticLambda7(coroutineScope, rememberSheetState, i9);
                        gapComposer2.updateRememberedValue(rememberedValue10);
                    }
                    composableLambdaImpl2 = composableLambdaImpl;
                    gapComposer = gapComposer2;
                    SheetKt.Sheet(function0, null, rememberSheetState, sheetPeekPosition$FixedHeight, null, false, null, Expect_jvmKt.rememberComposableLambda(-2107938637, new BasicShieetScope$$ExternalSyntheticLambda0(composableLambdaImpl2, rememberSheetState, function04, (Function0) rememberedValue10), gapComposer2), gapComposer, ((i6 >> 3) & 14) | 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
                    userDismissMode2 = userDismissMode3;
                    z2 = z3;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda2(obj, function0, function13, function12, function02, function03, z2, userDismissMode2, composableLambdaImpl2, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            i3 = i2 & 128;
            if (i3 == 0) {
            }
            i5 = i7 | i4;
            if (gapComposer2.shouldExecute(i5 & 1, (38347923 & i5) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }

        public static NavType checkNavType$navigation_runtime_release(TypedValue typedValue, NavType navType, NavType navType2, String str, String str2) {
            if (navType == null || navType == navType2) {
                return navType == null ? navType2 : navType;
            }
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Type is ", str, " but found ", str2, ": ");
            m.append(typedValue.data);
            throw new XmlPullParserException(m.toString());
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewBankTransferSetup.deepLinkSpecs;
        }
    }

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        context.getClass();
        navigatorProvider.getClass();
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NavArgument inflateArgument(TypedArray typedArray, Resources resources, int i) {
        NavType navType;
        int i2;
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintMode = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = sTmpValue;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string2 = typedArray.getString(2);
        Object obj = null;
        if (string2 != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string2.startsWith("java")) {
                try {
                    navType = AlertBannerKt.fromArgType("j$".concat(string2.substring(4)), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                }
            }
            navType = AlertBannerKt.fromArgType(string2, resourcePackageName);
        } else {
            navType = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            int i3 = typedValue.resourceId;
            IntNavType intNavType = NavType.ReferenceType;
            if (navType == intNavType) {
                if (i3 != 0) {
                    i2 = Integer.valueOf(i3);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sb = new StringBuilder("unsupported value '");
                        sb.append((Object) typedValue.string);
                        String name = navType.getName();
                        sb.append("' for ");
                        sb.append(name);
                        sb.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sb.toString());
                    }
                    i2 = 0;
                }
                obj = i2;
            } else if (i3 == 0) {
                IntNavType intNavType2 = NavType.StringType;
                if (navType == intNavType2) {
                    obj = typedArray.getString(1);
                } else {
                    int i4 = typedValue.type;
                    IntNavType intNavType3 = NavType.BoolType;
                    IntNavType intNavType4 = NavType.IntType;
                    IntNavType intNavType5 = NavType.FloatType;
                    if (i4 == 3) {
                        String obj2 = typedValue.string.toString();
                        if (navType == null) {
                            obj2.getClass();
                            try {
                                try {
                                    try {
                                        try {
                                            intNavType4.mo1158parseValue(obj2);
                                        } catch (IllegalArgumentException unused) {
                                            intNavType5.mo1158parseValue(obj2);
                                            intNavType2 = intNavType5;
                                            intNavType4 = intNavType2;
                                            navType = intNavType4;
                                            obj = navType.mo1158parseValue(obj2);
                                            if (obj != null) {
                                            }
                                            if (navType != null) {
                                            }
                                            return tintInfo.build();
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        intNavType4 = intNavType2;
                                        navType = intNavType4;
                                        obj = navType.mo1158parseValue(obj2);
                                        if (obj != null) {
                                        }
                                        if (navType != null) {
                                        }
                                        return tintInfo.build();
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    IntNavType intNavType6 = NavType.LongType;
                                    intNavType6.mo1158parseValue(obj2);
                                    intNavType2 = intNavType6;
                                    intNavType4 = intNavType2;
                                    navType = intNavType4;
                                    obj = navType.mo1158parseValue(obj2);
                                    if (obj != null) {
                                    }
                                    if (navType != null) {
                                    }
                                    return tintInfo.build();
                                }
                            } catch (IllegalArgumentException unused4) {
                                intNavType3.mo1158parseValue(obj2);
                                intNavType2 = intNavType3;
                                intNavType4 = intNavType2;
                                navType = intNavType4;
                                obj = navType.mo1158parseValue(obj2);
                                if (obj != null) {
                                }
                                if (navType != null) {
                                }
                                return tintInfo.build();
                            }
                            navType = intNavType4;
                        }
                        obj = navType.mo1158parseValue(obj2);
                    } else if (i4 == 4) {
                        navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, intNavType5, string2, InquiryField.FloatField.TYPE);
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, intNavType4, string2, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, intNavType3, string2, InquiryField.BooleanField.TYPE);
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i4 < 16 || i4 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (navType == intNavType5) {
                            navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, intNavType5, string2, InquiryField.FloatField.TYPE);
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            navType = Companion.checkNavType$navigation_runtime_release(typedValue, navType, intNavType4, string2, InquiryField.IntegerField.TYPE);
                            obj = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            } else {
                if (navType != null) {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    String name2 = navType.getName();
                    sb2.append("' for ");
                    sb2.append(name2);
                    sb2.append(". You must use a \"reference\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
                obj = Integer.valueOf(i3);
                navType = intNavType;
            }
        }
        if (obj != null) {
            tintInfo.mTintMode = obj;
            tintInfo.mHasTintList = true;
        }
        if (navType != null) {
            tintInfo.mTintList = navType;
        }
        return tintInfo.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f3, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0214, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NavDestination inflate(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) {
        int depth;
        String str;
        String str2;
        Context context;
        int i2;
        Object obj;
        int i3 = i;
        String name = xmlResourceParser.getName();
        name.getClass();
        NavDestination createDestination = this.navigatorProvider.getNavigator(name).createDestination();
        Context context2 = this.context;
        createDestination.onInflate(context2, attributeSet);
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean equals = "argument".equals(name2);
                int[] iArr = androidx.navigation.common.R$styleable.NavArgument;
                if (equals) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    obtainAttributes.getClass();
                    String string2 = obtainAttributes.getString(0);
                    if (string2 == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    createDestination.addArgument(string2, inflateArgument(obtainAttributes, resources, i3));
                    obtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, androidx.navigation.common.R$styleable.NavDeepLink);
                    obtainAttributes2.getClass();
                    String string3 = obtainAttributes2.getString(3);
                    String string4 = obtainAttributes2.getString(i4);
                    String string5 = obtainAttributes2.getString(2);
                    if ((string3 == null || string3.length() == 0) && ((string4 == null || string4.length() == 0) && (string5 == null || string5.length() == 0))) {
                        break;
                    }
                    String str3 = null;
                    if (string3 != null) {
                        String packageName = context2.getPackageName();
                        packageName.getClass();
                        str = StringsKt__StringsJVMKt.replace$default(string3, "${applicationId}", packageName);
                    } else {
                        str = null;
                    }
                    if (string4 == null || string4.length() == 0) {
                        str2 = null;
                    } else {
                        String packageName2 = context2.getPackageName();
                        packageName2.getClass();
                        str2 = StringsKt__StringsJVMKt.replace$default(string4, "${applicationId}", packageName2);
                        if (str2.length() <= 0) {
                            a$$ExternalSyntheticBUOutline0.m$3("The NavDeepLink cannot have an empty action.");
                            return null;
                        }
                    }
                    if (string5 != null) {
                        String packageName3 = context2.getPackageName();
                        packageName3.getClass();
                        str3 = StringsKt__StringsJVMKt.replace$default(string5, "${applicationId}", packageName3);
                    }
                    createDestination.addDeepLink(new NavDeepLink(str, str2, str3));
                    obtainAttributes2.recycle();
                } else {
                    if ("action".equals(name2)) {
                        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, androidx.navigation.common.R$styleable.NavAction, 0, 0);
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        int i5 = i4;
                        NavAction navAction = new NavAction(obtainStyledAttributes.getResourceId(i4, 0));
                        navAction.navOptions = new NavOptions(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                        EmptyMap.INSTANCE.getClass();
                        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            context = context2;
                            if (next2 == i5) {
                                i2 = depth2;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            i2 = depth2;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                    obtainAttributes3.getClass();
                                    String string6 = obtainAttributes3.getString(0);
                                    if (string6 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    NavArgument inflateArgument = inflateArgument(obtainAttributes3, resources, i3);
                                    boolean z = inflateArgument.isDefaultValuePresent;
                                    if (z && z && (obj = inflateArgument.defaultValue) != null) {
                                        inflateArgument.f901type.put(bundleOf, string6, obj);
                                    }
                                    obtainAttributes3.recycle();
                                }
                                i3 = i;
                            }
                            context2 = context;
                            depth2 = i2;
                            i5 = 1;
                        }
                        if (!bundleOf.isEmpty()) {
                            navAction.defaultArguments = bundleOf;
                        }
                        createDestination.putAction(resourceId, navAction);
                        obtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        i2 = depth2;
                        if ("include".equals(name2) && (createDestination instanceof NavGraph)) {
                            TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, R$styleable.NavInclude);
                            obtainAttributes4.getClass();
                            ((NavGraph) createDestination).impl.addDestination$navigation_common_release(inflate(obtainAttributes4.getResourceId(0, 0)));
                            obtainAttributes4.recycle();
                        } else if (createDestination instanceof NavGraph) {
                            ((NavGraph) createDestination).impl.addDestination$navigation_common_release(inflate(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i3 = i;
                    context2 = context;
                    depth2 = i2;
                    i4 = 1;
                }
            }
        }
    }

    public final NavGraph inflate(int i) {
        int next;
        Resources resources = this.context.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            asAttributeSet.getClass();
            NavDestination inflate = inflate(resources, xml, asAttributeSet, i);
            if (inflate instanceof NavGraph) {
                return (NavGraph) inflate;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
