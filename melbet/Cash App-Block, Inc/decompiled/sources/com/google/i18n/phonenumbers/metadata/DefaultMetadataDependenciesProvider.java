package com.google.i18n.phonenumbers.metadata;

import com.google.crypto.tink.KeysetHandle;
import com.google.i18n.phonenumbers.metadata.init.ClassPathResourceMetadataLoader;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import com.google.mlkit.common.internal.zzd;
import com.google.mlkit.common.internal.zze;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class DefaultMetadataDependenciesProvider {
    public static final DefaultMetadataDependenciesProvider INSTANCE = new DefaultMetadataDependenciesProvider();
    public final MetadataParser metadataParser = new MetadataParser();
    public final ClassPathResourceMetadataLoader metadataLoader = new ClassPathResourceMetadataLoader();
    public final Symbol phoneNumberMetadataFileNameProvider = new Symbol("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto");

    public DefaultMetadataDependenciesProvider() {
        new KeysetHandle(new zze(10));
        new KeysetHandle(new zzd(10));
        new ConcurrentHashMap();
        "/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto".concat("_");
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        "/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto".concat("_");
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
