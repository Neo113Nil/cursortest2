package com.squareup.cash.api;

import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.AutoValue_Identifier;
import androidx.camera.core.impl.CameraConfigs;
import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TextCard;
import com.squareup.cash.moneybot.components.plugins.TextCardPlugin;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Instant;
import kotlin.time.InstantKt;
import okio.ByteString;
import string.compareToDate.ComparePrecision;

/* loaded from: classes8.dex */
public abstract class Aliases {
    public static final CameraIdentifier create(String str, String str2, AutoValue_Identifier autoValue_Identifier) {
        str.getClass();
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(str);
        if (str2 != null) {
            mutableListOf.add(str2);
        }
        return new CameraIdentifier(mutableListOf, autoValue_Identifier);
    }

    public static Instant formatDate(String str, ComparePrecision comparePrecision) {
        int i;
        String str2;
        comparePrecision.getClass();
        Instant.Companion companion = Instant.Companion;
        switch (comparePrecision.ordinal()) {
            case 0:
                i = 24;
                break;
            case 1:
                i = 19;
                break;
            case 2:
                i = 16;
                break;
            case 3:
                i = 13;
                break;
            case 4:
                i = 10;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 4;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        String substring = str.substring(0, i);
        switch (comparePrecision.ordinal()) {
            case 0:
                str2 = "";
                break;
            case 1:
                str2 = ".001Z";
                break;
            case 2:
                str2 = ":00.001Z";
                break;
            case 3:
                str2 = ":00:00.001Z";
                break;
            case 4:
                str2 = "T00:00:00.001Z";
                break;
            case 5:
                str2 = "-01T00:00:00.001Z";
                break;
            case 6:
                str2 = "-01-01T00:00:00.001Z";
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        return InstantKt.access$parseIso(substring.concat(str2)).toInstant();
    }

    public static final CameraIdentifier fromAdapterInfos(AdapterCameraInfo adapterCameraInfo, AdapterCameraInfo adapterCameraInfo2) {
        String cameraId = adapterCameraInfo2 != null ? adapterCameraInfo2.mCameraInfoInternal.getCameraId() : null;
        AutoValue_Identifier autoValue_Identifier = ((CameraConfigs.DefaultCameraConfig) adapterCameraInfo.mCameraConfig).mIdentifier;
        autoValue_Identifier.getClass();
        String cameraId2 = adapterCameraInfo.mCameraInfoInternal.getCameraId();
        cameraId2.getClass();
        return create(cameraId2, cameraId, autoValue_Identifier);
    }

    public static final String hash(String str) {
        str.getClass();
        ByteString.Companion companion = ByteString.Companion;
        return ByteString.Companion.encodeUtf8(str).digest$okio("SHA-256").hex().substring(0, 40);
    }

    public static TextCard toTextCard$default(TextCardPlugin textCardPlugin, com.squareup.protos.cash.kgoose.api.v3.TextCard textCard, String str) {
        PatternRedaction patternRedaction = new PatternRedaction(str, (String) null, 2);
        try {
            Icon icon = textCard.icon;
            LocalizedString localizedString = textCard.label;
            String str2 = localizedString != null ? localizedString.translated_value : null;
            LocalizedString localizedString2 = textCard.text;
            if (localizedString2 == null) {
                throw new IllegalArgumentException("text");
            }
            String str3 = localizedString2.translated_value;
            if (str3 != null) {
                return new TextCard(icon, str, str2, str3);
            }
            throw new IllegalArgumentException("text translated_value");
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(com.squareup.protos.cash.kgoose.api.v3.TextCard.class), patternRedaction, null);
        }
    }
}
