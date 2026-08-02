package com.squareup.address.typeahead.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import coil3.network.NetworkFetcher$fetch$2;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda5;
import com.squareup.address.typeahead.backend.api.LocationType;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class AddressTypeaheadStateKt {
    public static final ComposableLambdaImpl lambda$1928970838 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(18), false, 1928970838);

    /* renamed from: lambda$-1340009615, reason: not valid java name */
    public static final ComposableLambdaImpl f97lambda$1340009615 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(19), false, -1340009615);
    public static final ComposableLambdaImpl lambda$870265128 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(20), false, 870265128);

    /* renamed from: lambda$-825758231, reason: not valid java name */
    public static final ComposableLambdaImpl f99lambda$825758231 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(21), false, -825758231);

    /* renamed from: lambda$-1403269871, reason: not valid java name */
    public static final ComposableLambdaImpl f98lambda$1403269871 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda5(22), false, -1403269871);

    public static final boolean access$getUsesAddressLine1Field(LocationType locationType) {
        int ordinal = locationType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r4.changed(r20) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa A[LOOP:0: B:26:0x00f4->B:28:0x00fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AddressTypeaheadState rememberAddressTypeaheadState(PlacesAddressSearcher placesAddressSearcher, Country country, LocationType locationType, GlobalAddress globalAddress, boolean z, ArrayList arrayList, Composer composer, int i, int i2) {
        boolean z2;
        boolean z3;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        Iterator it;
        country.getClass();
        locationType.getClass();
        Iterable iterable = (i2 & 32) != 0 ? EmptyList.INSTANCE : arrayList;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2032627879);
        Object[] objArr = {locationType, country};
        int i3 = 1;
        int i4 = 0;
        boolean changedInstance2 = ((((i & 112) ^ 48) > 32 && gapComposer.changed(country.ordinal())) || (i & 48) == 32) | ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(locationType.ordinal())) || (i & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer.changedInstance(globalAddress);
        if (((57344 & i) ^ 24576) <= 16384) {
        }
        if ((i & 24576) != 16384) {
            z2 = false;
            z3 = z2 | changedInstance2;
            rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (!z3 || rememberedValue == neverEqualPolicy) {
                ShiftListViewKt$$ExternalSyntheticLambda10 shiftListViewKt$$ExternalSyntheticLambda10 = new ShiftListViewKt$$ExternalSyntheticLambda10(locationType, country, globalAddress, z, 2);
                gapComposer.updateRememberedValue(shiftListViewKt$$ExternalSyntheticLambda10);
                rememberedValue = shiftListViewKt$$ExternalSyntheticLambda10;
            }
            AddressTypeaheadState addressTypeaheadState = (AddressTypeaheadState) SaverKt.m581rememberSaveable(objArr, (Saver) AddressTypeaheadState.Saver.INSTANCE, (Function0) rememberedValue, (Composer) gapComposer, 48);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            changedInstance = gapComposer.changedInstance(context);
            rememberedValue2 = gapComposer.rememberedValue();
            if (!changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new NetworkFetcher$fetch$2(1, context, Context.class, "getString", "getString(I)Ljava/lang/String;", 0, 19);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function1 = (Function1) ((KFunction) rememberedValue2);
            addressTypeaheadState.getClass();
            function1.getClass();
            addressTypeaheadState.getString = function1;
            Iterable iterable2 = iterable;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new PreviewSearchResult((Pair) it.next()));
            }
            addressTypeaheadState.resultSuggestions = arrayList2;
            Continuation continuation = null;
            if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                gapComposer.startReplaceGroup(-104540780);
                boolean changed = gapComposer.changed(addressTypeaheadState) | gapComposer.changedInstance(placesAddressSearcher);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new AddressTypeaheadStateKt$rememberAddressTypeaheadState$2$3$1(addressTypeaheadState, placesAddressSearcher, continuation, i3);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(addressTypeaheadState, placesAddressSearcher, (Function2) rememberedValue3, gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-104982127);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                boolean changed2 = gapComposer.changed(addressTypeaheadState) | gapComposer.changedInstance(placesAddressSearcher);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new AddressTypeaheadStateKt$rememberAddressTypeaheadState$2$3$1(addressTypeaheadState, placesAddressSearcher, continuation, i4);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                JobKt.launch$default(coroutineScope, null, coroutineStart, (Function2) rememberedValue5, 1);
                gapComposer.end(false);
            }
            gapComposer.end(false);
            return addressTypeaheadState;
        }
        z2 = true;
        z3 = z2 | changedInstance2;
        rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        if (!z3) {
        }
        ShiftListViewKt$$ExternalSyntheticLambda10 shiftListViewKt$$ExternalSyntheticLambda102 = new ShiftListViewKt$$ExternalSyntheticLambda10(locationType, country, globalAddress, z, 2);
        gapComposer.updateRememberedValue(shiftListViewKt$$ExternalSyntheticLambda102);
        rememberedValue = shiftListViewKt$$ExternalSyntheticLambda102;
        AddressTypeaheadState addressTypeaheadState2 = (AddressTypeaheadState) SaverKt.m581rememberSaveable(objArr, (Saver) AddressTypeaheadState.Saver.INSTANCE, (Function0) rememberedValue, (Composer) gapComposer, 48);
        Context context2 = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        changedInstance = gapComposer.changedInstance(context2);
        rememberedValue2 = gapComposer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new NetworkFetcher$fetch$2(1, context2, Context.class, "getString", "getString(I)Ljava/lang/String;", 0, 19);
        gapComposer.updateRememberedValue(rememberedValue2);
        Function1 function12 = (Function1) ((KFunction) rememberedValue2);
        addressTypeaheadState2.getClass();
        function12.getClass();
        addressTypeaheadState2.getString = function12;
        Iterable iterable22 = iterable;
        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable22, 10));
        it = iterable22.iterator();
        while (it.hasNext()) {
        }
        addressTypeaheadState2.resultSuggestions = arrayList22;
        Continuation continuation2 = null;
        if (((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
        }
        gapComposer.end(false);
        return addressTypeaheadState2;
    }
}
