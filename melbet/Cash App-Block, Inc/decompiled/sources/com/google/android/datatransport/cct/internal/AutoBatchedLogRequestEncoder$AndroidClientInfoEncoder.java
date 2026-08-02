package com.google.android.datatransport.cct.internal;

import com.appsflyer.AdRevenueScheme;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes4.dex */
public final class AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder implements ObjectEncoder {
    public static final AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder INSTANCE = new AutoBatchedLogRequestEncoder$AndroidClientInfoEncoder();
    public static final FieldDescriptor SDKVERSION_DESCRIPTOR = FieldDescriptor.of("sdkVersion");
    public static final FieldDescriptor MODEL_DESCRIPTOR = FieldDescriptor.of("model");
    public static final FieldDescriptor HARDWARE_DESCRIPTOR = FieldDescriptor.of("hardware");
    public static final FieldDescriptor DEVICE_DESCRIPTOR = FieldDescriptor.of("device");
    public static final FieldDescriptor PRODUCT_DESCRIPTOR = FieldDescriptor.of("product");
    public static final FieldDescriptor OSBUILD_DESCRIPTOR = FieldDescriptor.of("osBuild");
    public static final FieldDescriptor MANUFACTURER_DESCRIPTOR = FieldDescriptor.of("manufacturer");
    public static final FieldDescriptor FINGERPRINT_DESCRIPTOR = FieldDescriptor.of("fingerprint");
    public static final FieldDescriptor LOCALE_DESCRIPTOR = FieldDescriptor.of("locale");
    public static final FieldDescriptor COUNTRY_DESCRIPTOR = FieldDescriptor.of(AdRevenueScheme.COUNTRY);
    public static final FieldDescriptor MCCMNC_DESCRIPTOR = FieldDescriptor.of("mccMnc");
    public static final FieldDescriptor APPLICATIONBUILD_DESCRIPTOR = FieldDescriptor.of("applicationBuild");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, Object obj2) {
        AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(SDKVERSION_DESCRIPTOR, ((AutoValue_AndroidClientInfo) androidClientInfo).sdkVersion);
        AutoValue_AndroidClientInfo autoValue_AndroidClientInfo = (AutoValue_AndroidClientInfo) androidClientInfo;
        objectEncoderContext.add(MODEL_DESCRIPTOR, autoValue_AndroidClientInfo.model);
        objectEncoderContext.add(HARDWARE_DESCRIPTOR, autoValue_AndroidClientInfo.hardware);
        objectEncoderContext.add(DEVICE_DESCRIPTOR, autoValue_AndroidClientInfo.device);
        objectEncoderContext.add(PRODUCT_DESCRIPTOR, autoValue_AndroidClientInfo.product);
        objectEncoderContext.add(OSBUILD_DESCRIPTOR, autoValue_AndroidClientInfo.osBuild);
        objectEncoderContext.add(MANUFACTURER_DESCRIPTOR, autoValue_AndroidClientInfo.manufacturer);
        objectEncoderContext.add(FINGERPRINT_DESCRIPTOR, autoValue_AndroidClientInfo.fingerprint);
        objectEncoderContext.add(LOCALE_DESCRIPTOR, autoValue_AndroidClientInfo.locale);
        objectEncoderContext.add(COUNTRY_DESCRIPTOR, autoValue_AndroidClientInfo.country);
        objectEncoderContext.add(MCCMNC_DESCRIPTOR, autoValue_AndroidClientInfo.mccMnc);
        objectEncoderContext.add(APPLICATIONBUILD_DESCRIPTOR, autoValue_AndroidClientInfo.applicationBuild);
    }
}
