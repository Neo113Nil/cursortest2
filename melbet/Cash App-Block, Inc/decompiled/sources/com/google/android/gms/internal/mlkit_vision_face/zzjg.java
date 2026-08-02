package com.google.android.gms.internal.mlkit_vision_face;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.lending.sync_values.Tile;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzjg {
    /* JADX WARN: Multi-variable type inference failed */
    public static ResourceEvent.Resource fromJsonObject(JsonObject jsonObject) {
        ResourceEvent.Resource resource;
        int i;
        String str;
        int i2;
        String str2;
        String str3;
        ResourceEvent.Redirect redirect;
        ResourceEvent.Ssl ssl;
        ResourceEvent.FirstByte firstByte;
        ResourceEvent.Download download;
        String str4;
        int i3;
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        String asString;
        JsonObject asJsonObject3;
        JsonObject asJsonObject4;
        JsonObject asJsonObject5;
        JsonObject asJsonObject6;
        JsonObject asJsonObject7;
        JsonObject asJsonObject8;
        JsonObject asJsonObject9;
        String asString2;
        String asString3;
        jsonObject.getClass();
        try {
            JsonElement jsonElement = jsonObject.get("id");
            String asString4 = jsonElement != null ? jsonElement.getAsString() : null;
            String asString5 = jsonObject.get("type").getAsString();
            asString5.getClass();
            int[] values = CameraSelector$$ExternalSyntheticOutline0.values(11);
            int length = values.length;
            int i4 = 0;
            while (i4 < length) {
                int[] iArr = values;
                int i5 = iArr[i4];
                if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$21(i5).equals(asString5)) {
                    JsonElement jsonElement2 = jsonObject.get("method");
                    if (jsonElement2 != null && (asString3 = jsonElement2.getAsString()) != null) {
                        for (int i6 : CameraSelector$$ExternalSyntheticOutline0.values(9)) {
                            if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$15(i6).equals(asString3)) {
                                i = i6;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    i = 0;
                    String asString6 = jsonObject.get("url").getAsString();
                    JsonElement jsonElement3 = jsonObject.get("status_code");
                    Long valueOf = jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null;
                    JsonElement jsonElement4 = jsonObject.get("duration");
                    Long valueOf2 = jsonElement4 != null ? Long.valueOf(jsonElement4.getAsLong()) : null;
                    JsonElement jsonElement5 = jsonObject.get("size");
                    Long valueOf3 = jsonElement5 != null ? Long.valueOf(jsonElement5.getAsLong()) : null;
                    JsonElement jsonElement6 = jsonObject.get("encoded_body_size");
                    Long valueOf4 = jsonElement6 != null ? Long.valueOf(jsonElement6.getAsLong()) : null;
                    JsonElement jsonElement7 = jsonObject.get("decoded_body_size");
                    Long valueOf5 = jsonElement7 != null ? Long.valueOf(jsonElement7.getAsLong()) : null;
                    JsonElement jsonElement8 = jsonObject.get("transfer_size");
                    Long valueOf6 = jsonElement8 != null ? Long.valueOf(jsonElement8.getAsLong()) : null;
                    JsonElement jsonElement9 = jsonObject.get("render_blocking_status");
                    if (jsonElement9 != null && (asString2 = jsonElement9.getAsString()) != null) {
                        str = null;
                        int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(2);
                        int length2 = values2.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            i2 = values2[i7];
                            int i8 = i7;
                            if (!ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$18(i2).equals(asString2)) {
                                i7 = i8 + 1;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    str = null;
                    i2 = 0;
                    JsonElement jsonElement10 = jsonObject.get("worker");
                    ResourceEvent.Worker fromJsonObject = (jsonElement10 == null || (asJsonObject9 = jsonElement10.getAsJsonObject()) == null) ? str : Tile.AbstractC0074Tile.fromJsonObject(asJsonObject9);
                    JsonElement jsonElement11 = jsonObject.get("redirect");
                    Object fromJsonObject2 = (jsonElement11 == null || (asJsonObject8 = jsonElement11.getAsJsonObject()) == null) ? str : zzjf.fromJsonObject(asJsonObject8);
                    JsonElement jsonElement12 = jsonObject.get("dns");
                    ResourceEvent.Dns fromJsonObject3 = (jsonElement12 == null || (asJsonObject7 = jsonElement12.getAsJsonObject()) == null) ? str : zzeb.fromJsonObject(asJsonObject7);
                    JsonElement jsonElement13 = jsonObject.get("connect");
                    Object fromJsonObject4 = (jsonElement13 == null || (asJsonObject6 = jsonElement13.getAsJsonObject()) == null) ? str : zzds.fromJsonObject(asJsonObject6);
                    Object obj = fromJsonObject2;
                    JsonElement jsonElement14 = jsonObject.get("ssl");
                    Object fromJsonObject5 = (jsonElement14 == null || (asJsonObject5 = jsonElement14.getAsJsonObject()) == null) ? str : zzjj.fromJsonObject(asJsonObject5);
                    JsonElement jsonElement15 = jsonObject.get("first_byte");
                    Object fromJsonObject6 = (jsonElement15 == null || (asJsonObject4 = jsonElement15.getAsJsonObject()) == null) ? str : zzee.fromJsonObject(asJsonObject4);
                    JsonElement jsonElement16 = jsonObject.get("download");
                    Object fromJsonObject7 = (jsonElement16 == null || (asJsonObject3 = jsonElement16.getAsJsonObject()) == null) ? str : zzec.fromJsonObject(asJsonObject3);
                    JsonElement jsonElement17 = jsonObject.get("protocol");
                    String asString7 = jsonElement17 != null ? jsonElement17.getAsString() : str;
                    JsonElement jsonElement18 = jsonObject.get("delivery_type");
                    if (jsonElement18 != null && (asString = jsonElement18.getAsString()) != null) {
                        str2 = asString6;
                        int[] values3 = CameraSelector$$ExternalSyntheticOutline0.values(3);
                        str3 = asString4;
                        int length3 = values3.length;
                        int i9 = 0;
                        while (i9 < length3) {
                            int i10 = values3[i9];
                            int i11 = i9;
                            if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$12(i10).equals(asString)) {
                                String str5 = asString7;
                                i3 = i10;
                                redirect = obj;
                                ssl = fromJsonObject5;
                                firstByte = fromJsonObject6;
                                download = fromJsonObject7;
                                str4 = str5;
                            } else {
                                i9 = i11 + 1;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    str2 = asString6;
                    str3 = asString4;
                    redirect = obj;
                    ssl = fromJsonObject5;
                    firstByte = fromJsonObject6;
                    download = fromJsonObject7;
                    str4 = asString7;
                    i3 = 0;
                    JsonElement jsonElement19 = jsonObject.get("provider");
                    Object fromJsonObject8 = (jsonElement19 == null || (asJsonObject2 = jsonElement19.getAsJsonObject()) == null) ? str : zzje.fromJsonObject(asJsonObject2);
                    JsonElement jsonElement20 = jsonObject.get("graphql");
                    Object fromJsonObject9 = (jsonElement20 == null || (asJsonObject = jsonElement20.getAsJsonObject()) == null) ? str : UiControl.Button.fromJsonObject(asJsonObject);
                    str2.getClass();
                    return new ResourceEvent.Resource(str3, i5, i, str2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, i2, fromJsonObject, redirect, fromJsonObject3, fromJsonObject4, ssl, firstByte, download, str4, i3, fromJsonObject8, fromJsonObject9);
                }
                try {
                    resource = null;
                    i4++;
                    values = iArr;
                } catch (IllegalStateException e) {
                    e = e;
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Resource", e);
                    return resource;
                } catch (NullPointerException e2) {
                    e = e2;
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Resource", e);
                    return resource;
                } catch (NumberFormatException e3) {
                    e = e3;
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Resource", e);
                    return resource;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e4) {
            e = e4;
            resource = null;
        } catch (NullPointerException e5) {
            e = e5;
            resource = null;
        } catch (NumberFormatException e6) {
            e = e6;
            resource = null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewThreadedCustomerActivity.deepLinkSpecs;
    }
}
