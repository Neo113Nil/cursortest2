package com.google.common.io;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.graphics.backend.engine.EntityStateImpl;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes9.dex */
public abstract class Files {
    public static void createParentDirs(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(file, "Unable to create parent directories of ");
    }

    public static final LightStateImpl rememberLightState(EntityStateImpl entityStateImpl, Vector4 vector4, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            LightStateImpl lightStateImpl = new LightStateImpl(entityStateImpl, vector4, mutableState, mutableState2, mutableState3);
            gapComposer.updateRememberedValue(lightStateImpl);
            rememberedValue = lightStateImpl;
        }
        return (LightStateImpl) rememberedValue;
    }

    public static final Object toValue(ComponentParam componentParam) {
        componentParam.getClass();
        if (componentParam instanceof ComponentParam.Address) {
            ComponentParam.Address address = (ComponentParam.Address) componentParam;
            return MapsKt__MapsKt.mapOf(new Pair("street_1", address.street1), new Pair("street_2", address.street2), new Pair("city", address.city), new Pair("subdivision", address.subdivision), new Pair("postal_code", address.postalCode));
        }
        if (componentParam instanceof ComponentParam.ComponentString) {
            return ((ComponentParam.ComponentString) componentParam).value;
        }
        if (componentParam instanceof ComponentParam.ComponentStringList) {
            return ((ComponentParam.ComponentStringList) componentParam).value;
        }
        if (componentParam instanceof ComponentParam.ComponentBoolean) {
            return Boolean.valueOf(((ComponentParam.ComponentBoolean) componentParam).value);
        }
        if (componentParam instanceof ComponentParam.ComponentNumber) {
            return ((ComponentParam.ComponentNumber) componentParam).value;
        }
        if (componentParam instanceof ComponentParam.ESignature) {
            String str = ((ComponentParam.ESignature) componentParam).signatureImageString;
            return str == null ? "" : str;
        }
        if (componentParam instanceof ComponentParam.GovernmentIdNfcScan) {
            ComponentParam.GovernmentIdNfcScan governmentIdNfcScan = (ComponentParam.GovernmentIdNfcScan) componentParam;
            return MapsKt__MapsKt.mapOf(new Pair("caFlag", governmentIdNfcScan.chipAuthenticationStatus), new Pair("dg1", governmentIdNfcScan.dg1), new Pair("dg2", governmentIdNfcScan.dg2), new Pair("sod", governmentIdNfcScan.sod));
        }
        if (componentParam instanceof ComponentParam.InternationalDbParams) {
            ComponentParam.InternationalDbParams internationalDbParams = (ComponentParam.InternationalDbParams) componentParam;
            return MapsKt__MapsKt.mapOf(new Pair("idb_country", internationalDbParams.country), new Pair("idb_type", internationalDbParams.f1517type), new Pair("idb_value", internationalDbParams.value));
        }
        if (componentParam instanceof ComponentParam.PhoneNumberSnaParams) {
            ComponentParam.PhoneNumberSnaParams phoneNumberSnaParams = (ComponentParam.PhoneNumberSnaParams) componentParam;
            return MapsKt__MapsKt.mapOf(new Pair("code", phoneNumberSnaParams.code), new Pair(BreadcrumbHelper.Category.ERROR, MapsKt__MapsKt.mapOf(new Pair("name", phoneNumberSnaParams.errorName), new Pair("message", phoneNumberSnaParams.errorMessage))));
        }
        if (!(componentParam instanceof ComponentParam.FileUpload)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        ArrayList<Uri> arrayList = ((ComponentParam.FileUpload) componentParam).uris;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Uri uri : arrayList) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = uri.toString();
                lastPathSegment.getClass();
            }
            arrayList2.add(lastPathSegment);
        }
        return arrayList2;
    }
}
