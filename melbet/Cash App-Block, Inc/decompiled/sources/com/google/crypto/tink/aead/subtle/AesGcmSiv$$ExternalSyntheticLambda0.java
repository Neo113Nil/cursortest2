package com.google.crypto.tink.aead.subtle;

import android.os.Bundle;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.internal.zzbke;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.miteksystems.misnap.camera.a.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public final /* synthetic */ class AesGcmSiv$$ExternalSyntheticLambda0 implements TextInputLayout.LengthCounter, Continuation, Transformer, ObjectConstructor, GoogleMap.OnInfoWindowClickListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AesGcmSiv$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(Object obj, Object obj2, int i, Object obj3, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append(obj3);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m$1(String str) {
        throw new InvalidAlgorithmParameterException(str);
    }

    public static /* synthetic */ void m$2(String str) {
        throw new InvalidKeyException(str);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        MessagingClientEventExtension messagingClientEventExtension = (MessagingClientEventExtension) obj;
        messagingClientEventExtension.getClass();
        n nVar = ProtoEncoderDoNotUse.ENCODER;
        nVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            nVar.encode(messagingClientEventExtension, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.google.gson.internal.ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        Map lambda$newMapConstructor$14;
        Map lambda$newMapConstructor$15;
        Map lambda$newMapConstructor$16;
        Map lambda$newMapConstructor$17;
        Map lambda$newMapConstructor$18;
        Collection lambda$newCollectionConstructor$10;
        Collection lambda$newCollectionConstructor$11;
        Collection lambda$newCollectionConstructor$12;
        Collection lambda$newCollectionConstructor$13;
        switch (this.$r8$classId) {
            case 15:
                lambda$newMapConstructor$14 = ConstructorConstructor.lambda$newMapConstructor$14();
                return lambda$newMapConstructor$14;
            case 16:
                lambda$newMapConstructor$15 = ConstructorConstructor.lambda$newMapConstructor$15();
                return lambda$newMapConstructor$15;
            case 17:
                lambda$newMapConstructor$16 = ConstructorConstructor.lambda$newMapConstructor$16();
                return lambda$newMapConstructor$16;
            case 18:
                lambda$newMapConstructor$17 = ConstructorConstructor.lambda$newMapConstructor$17();
                return lambda$newMapConstructor$17;
            case 19:
                lambda$newMapConstructor$18 = ConstructorConstructor.lambda$newMapConstructor$18();
                return lambda$newMapConstructor$18;
            case 20:
                lambda$newCollectionConstructor$10 = ConstructorConstructor.lambda$newCollectionConstructor$10();
                return lambda$newCollectionConstructor$10;
            case 21:
                lambda$newCollectionConstructor$11 = ConstructorConstructor.lambda$newCollectionConstructor$11();
                return lambda$newCollectionConstructor$11;
            case 22:
                lambda$newCollectionConstructor$12 = ConstructorConstructor.lambda$newCollectionConstructor$12();
                return lambda$newCollectionConstructor$12;
            default:
                lambda$newCollectionConstructor$13 = ConstructorConstructor.lambda$newCollectionConstructor$13();
                return lambda$newCollectionConstructor$13;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i;
        switch (this.$r8$classId) {
            case 9:
                i = 403;
                break;
            case 10:
                i = -1;
                break;
            default:
                Bundle bundle = (Bundle) task.getResult$1();
                if (bundle == null) {
                    a$$ExternalSyntheticBUOutline0.m$4("SERVICE_NOT_AVAILABLE");
                    return null;
                }
                String string2 = bundle.getString("registration_id");
                if (string2 != null || (string2 = bundle.getString("unregistered")) != null) {
                    return string2;
                }
                String string3 = bundle.getString(BreadcrumbHelper.Category.ERROR);
                if ("RST".equals(string3)) {
                    a$$ExternalSyntheticBUOutline0.m$4("INSTANCE_ID_RESET");
                    return null;
                }
                if (string3 != null) {
                    a$$ExternalSyntheticBUOutline0.m$4(string3);
                    return null;
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                a$$ExternalSyntheticBUOutline0.m$4("SERVICE_NOT_AVAILABLE");
                return null;
        }
        return Integer.valueOf(i);
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void m(String str) {
        throw new zzbke(str);
    }

    public static /* synthetic */ void m(String str, float f) {
        throw new IllegalArgumentException(str + f);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new NumberFormatException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new JsonParseException(str, th);
    }
}
