package com.datadog.android.rum.model;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_face.zzjr;
import com.google.android.gms.internal.mlkit_vision_face.zzkn;
import com.google.android.gms.internal.mlkit_vision_face.zzko;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientroutes.DeepLinkSpec;
import com.squareup.cash.clientrouting.UtilsKt;
import com.squareup.cash.clientsync.EntitySyncerKt;
import com.squareup.cash.common.moneyformatter.MoneyKt;
import com.squareup.util.MathsKt;
import com.squareup.util.android.Intents;
import com.squareup.util.android.Keyboards;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.compose.ProgressBarKt;
import com.squareup.util.coroutines.TakeUntilKt;
import com.squareup.util.coroutines.TickerKt;
import com.squareup.util.emojis.EmojiEmbeddedImageResolverKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class ViewEvent {
    public final Account account;
    public final Application application;
    public final String buildId;
    public final String buildVersion;
    public final CiTest ciTest;
    public final Connectivity connectivity;
    public final Container container;
    public final Context context;
    public final long date;
    public final Dd dd;
    public final String ddtags;
    public final Device device;
    public final Display display;
    public final Context featureFlags;
    public final Os os;
    public final Privacy privacy;
    public final String service;
    public final ViewEventSession session;
    public final int source;
    public final Synthetics synthetics;
    public final Usr usr;
    public final String version;
    public final ViewEventView view;

    public final class Accessibility {
        public final Boolean assistiveSwitchEnabled;
        public final Boolean assistiveTouchEnabled;
        public final Boolean boldTextEnabled;
        public final Boolean buttonShapesEnabled;
        public final Boolean closedCaptioningEnabled;
        public final Boolean grayscaleEnabled;
        public final Boolean increaseContrastEnabled;
        public final Boolean invertColorsEnabled;
        public final Boolean monoAudioEnabled;
        public final Boolean onOffSwitchLabelsEnabled;
        public final Boolean reduceMotionEnabled;
        public final Boolean reduceTransparencyEnabled;
        public final Boolean reducedAnimationsEnabled;
        public final Boolean rtlEnabled;
        public final Boolean screenReaderEnabled;
        public final Boolean shakeToUndoEnabled;
        public final Boolean shouldDifferentiateWithoutColor;
        public final Boolean singleAppModeEnabled;
        public final Boolean speakScreenEnabled;
        public final Boolean speakSelectionEnabled;
        public final String textSize;
        public final Boolean videoAutoplayEnabled;

        public Accessibility(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21) {
            this.textSize = str;
            this.screenReaderEnabled = bool;
            this.boldTextEnabled = bool2;
            this.reduceTransparencyEnabled = bool3;
            this.reduceMotionEnabled = bool4;
            this.buttonShapesEnabled = bool5;
            this.invertColorsEnabled = bool6;
            this.increaseContrastEnabled = bool7;
            this.assistiveSwitchEnabled = bool8;
            this.assistiveTouchEnabled = bool9;
            this.videoAutoplayEnabled = bool10;
            this.closedCaptioningEnabled = bool11;
            this.monoAudioEnabled = bool12;
            this.shakeToUndoEnabled = bool13;
            this.reducedAnimationsEnabled = bool14;
            this.shouldDifferentiateWithoutColor = bool15;
            this.grayscaleEnabled = bool16;
            this.singleAppModeEnabled = bool17;
            this.onOffSwitchLabelsEnabled = bool18;
            this.speakScreenEnabled = bool19;
            this.speakSelectionEnabled = bool20;
            this.rtlEnabled = bool21;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Accessibility)) {
                return false;
            }
            Accessibility accessibility = (Accessibility) obj;
            return Intrinsics.areEqual(this.textSize, accessibility.textSize) && Intrinsics.areEqual(this.screenReaderEnabled, accessibility.screenReaderEnabled) && Intrinsics.areEqual(this.boldTextEnabled, accessibility.boldTextEnabled) && Intrinsics.areEqual(this.reduceTransparencyEnabled, accessibility.reduceTransparencyEnabled) && Intrinsics.areEqual(this.reduceMotionEnabled, accessibility.reduceMotionEnabled) && Intrinsics.areEqual(this.buttonShapesEnabled, accessibility.buttonShapesEnabled) && Intrinsics.areEqual(this.invertColorsEnabled, accessibility.invertColorsEnabled) && Intrinsics.areEqual(this.increaseContrastEnabled, accessibility.increaseContrastEnabled) && Intrinsics.areEqual(this.assistiveSwitchEnabled, accessibility.assistiveSwitchEnabled) && Intrinsics.areEqual(this.assistiveTouchEnabled, accessibility.assistiveTouchEnabled) && Intrinsics.areEqual(this.videoAutoplayEnabled, accessibility.videoAutoplayEnabled) && Intrinsics.areEqual(this.closedCaptioningEnabled, accessibility.closedCaptioningEnabled) && Intrinsics.areEqual(this.monoAudioEnabled, accessibility.monoAudioEnabled) && Intrinsics.areEqual(this.shakeToUndoEnabled, accessibility.shakeToUndoEnabled) && Intrinsics.areEqual(this.reducedAnimationsEnabled, accessibility.reducedAnimationsEnabled) && Intrinsics.areEqual(this.shouldDifferentiateWithoutColor, accessibility.shouldDifferentiateWithoutColor) && Intrinsics.areEqual(this.grayscaleEnabled, accessibility.grayscaleEnabled) && Intrinsics.areEqual(this.singleAppModeEnabled, accessibility.singleAppModeEnabled) && Intrinsics.areEqual(this.onOffSwitchLabelsEnabled, accessibility.onOffSwitchLabelsEnabled) && Intrinsics.areEqual(this.speakScreenEnabled, accessibility.speakScreenEnabled) && Intrinsics.areEqual(this.speakSelectionEnabled, accessibility.speakSelectionEnabled) && Intrinsics.areEqual(this.rtlEnabled, accessibility.rtlEnabled);
        }

        public final int hashCode() {
            String str = this.textSize;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.screenReaderEnabled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.boldTextEnabled;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.reduceTransparencyEnabled;
            int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.reduceMotionEnabled;
            int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.buttonShapesEnabled;
            int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.invertColorsEnabled;
            int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.increaseContrastEnabled;
            int hashCode8 = (hashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.assistiveSwitchEnabled;
            int hashCode9 = (hashCode8 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.assistiveTouchEnabled;
            int hashCode10 = (hashCode9 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.videoAutoplayEnabled;
            int hashCode11 = (hashCode10 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.closedCaptioningEnabled;
            int hashCode12 = (hashCode11 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.monoAudioEnabled;
            int hashCode13 = (hashCode12 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.shakeToUndoEnabled;
            int hashCode14 = (hashCode13 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.reducedAnimationsEnabled;
            int hashCode15 = (hashCode14 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Boolean bool15 = this.shouldDifferentiateWithoutColor;
            int hashCode16 = (hashCode15 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.grayscaleEnabled;
            int hashCode17 = (hashCode16 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Boolean bool17 = this.singleAppModeEnabled;
            int hashCode18 = (hashCode17 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            Boolean bool18 = this.onOffSwitchLabelsEnabled;
            int hashCode19 = (hashCode18 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            Boolean bool19 = this.speakScreenEnabled;
            int hashCode20 = (hashCode19 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            Boolean bool20 = this.speakSelectionEnabled;
            int hashCode21 = (hashCode20 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            Boolean bool21 = this.rtlEnabled;
            return hashCode21 + (bool21 != null ? bool21.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.screenReaderEnabled, "Accessibility(textSize=", this.textSize, ", screenReaderEnabled=", ", boldTextEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.boldTextEnabled, ", reduceTransparencyEnabled=", this.reduceTransparencyEnabled, ", reduceMotionEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.reduceMotionEnabled, ", buttonShapesEnabled=", this.buttonShapesEnabled, ", invertColorsEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.invertColorsEnabled, ", increaseContrastEnabled=", this.increaseContrastEnabled, ", assistiveSwitchEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.assistiveSwitchEnabled, ", assistiveTouchEnabled=", this.assistiveTouchEnabled, ", videoAutoplayEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.videoAutoplayEnabled, ", closedCaptioningEnabled=", this.closedCaptioningEnabled, ", monoAudioEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.monoAudioEnabled, ", shakeToUndoEnabled=", this.shakeToUndoEnabled, ", reducedAnimationsEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.reducedAnimationsEnabled, ", shouldDifferentiateWithoutColor=", this.shouldDifferentiateWithoutColor, ", grayscaleEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.grayscaleEnabled, ", singleAppModeEnabled=", this.singleAppModeEnabled, ", onOffSwitchLabelsEnabled=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.onOffSwitchLabelsEnabled, ", speakScreenEnabled=", this.speakScreenEnabled, ", speakSelectionEnabled=");
            m.append(this.speakSelectionEnabled);
            m.append(", rtlEnabled=");
            m.append(this.rtlEnabled);
            m.append(")");
            return m.toString();
        }
    }

    public final class Account {
        public static final String[] RESERVED_PROPERTIES = {"id", "name"};
        public final Map additionalProperties;
        public final String id;
        public final String name;

        public Account(String str, String str2, Map map) {
            str.getClass();
            this.id = str;
            this.name = str2;
            this.additionalProperties = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Account)) {
                return false;
            }
            Account account = (Account) obj;
            return Intrinsics.areEqual(this.id, account.id) && Intrinsics.areEqual(this.name, account.name) && this.additionalProperties.equals(account.additionalProperties);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.name;
            return this.additionalProperties.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Account(id=", this.id, ", name=", this.name, ", additionalProperties="), this.additionalProperties);
        }
    }

    public final class Action {
        public final long count;

        public Action(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Action) && this.count == ((Action) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "Action(count=", ")");
        }
    }

    public final class Application {
        public final String currentLocale;
        public final String id;

        public Application(String str, String str2) {
            str.getClass();
            this.id = str;
            this.currentLocale = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.areEqual(this.id, application.id) && Intrinsics.areEqual(this.currentLocale, application.currentLocale);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.currentLocale;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Application(id=", this.id, ", currentLocale=", this.currentLocale, ")");
        }
    }

    public final class Cellular {
        public final String carrierName;
        public final String technology;

        public Cellular(String str, String str2) {
            this.technology = str;
            this.carrierName = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cellular)) {
                return false;
            }
            Cellular cellular = (Cellular) obj;
            return Intrinsics.areEqual(this.technology, cellular.technology) && Intrinsics.areEqual(this.carrierName, cellular.carrierName);
        }

        public final int hashCode() {
            String str = this.technology;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.carrierName;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Cellular(technology=", this.technology, ", carrierName=", this.carrierName, ")");
        }
    }

    public final class CiTest {
        public final String testExecutionId;

        public CiTest(String str) {
            str.getClass();
            this.testExecutionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CiTest) && Intrinsics.areEqual(this.testExecutionId, ((CiTest) obj).testExecutionId);
        }

        public final int hashCode() {
            return this.testExecutionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CiTest(testExecutionId=", this.testExecutionId, ")");
        }
    }

    public abstract class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public static ViewEvent fromJsonObject(JsonObject jsonObject) {
            ViewEvent viewEvent;
            int i;
            JsonObject asJsonObject;
            JsonObject asJsonObject2;
            JsonObject asJsonObject3;
            JsonObject asJsonObject4;
            JsonObject asJsonObject5;
            JsonObject asJsonObject6;
            JsonObject asJsonObject7;
            JsonObject asJsonObject8;
            JsonObject asJsonObject9;
            JsonObject asJsonObject10;
            JsonObject asJsonObject11;
            JsonObject asJsonObject12;
            String asString;
            jsonObject.getClass();
            try {
                long asLong = jsonObject.get(InquiryField.DateField.TYPE).getAsLong();
                JsonObject asJsonObject13 = jsonObject.get("application").getAsJsonObject();
                asJsonObject13.getClass();
                Application fromJsonObject = zzjr.fromJsonObject(asJsonObject13);
                JsonElement jsonElement = jsonObject.get("service");
                String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = jsonObject.get("version");
                String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = jsonObject.get("build_version");
                String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = jsonObject.get("build_id");
                String asString5 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                JsonElement jsonElement5 = jsonObject.get("ddtags");
                String asString6 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                JsonObject asJsonObject14 = jsonObject.get("session").getAsJsonObject();
                asJsonObject14.getClass();
                ViewEventSession fromJsonObject2 = EmojiEmbeddedImageResolverKt.fromJsonObject(asJsonObject14);
                JsonElement jsonElement6 = jsonObject.get("source");
                int i2 = 0;
                if (jsonElement6 != null && (asString = jsonElement6.getAsString()) != null) {
                    int[] values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                    viewEvent = null;
                    try {
                        int length = values.length;
                        while (i2 < length) {
                            int i3 = values[i2];
                            int i4 = length;
                            if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(i3).equals(asString)) {
                                i = i3;
                            } else {
                                i2++;
                                length = i4;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    } catch (IllegalStateException e) {
                        e = e;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ViewEvent", e);
                        return viewEvent;
                    } catch (NullPointerException e2) {
                        e = e2;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ViewEvent", e);
                        return viewEvent;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ViewEvent", e);
                        return viewEvent;
                    }
                }
                viewEvent = null;
                i = 0;
                JsonObject asJsonObject15 = jsonObject.get("view").getAsJsonObject();
                asJsonObject15.getClass();
                ViewEventView fromJsonObject3 = MoneyKt.fromJsonObject(asJsonObject15);
                JsonElement jsonElement7 = jsonObject.get("usr");
                Usr fromJsonObject4 = (jsonElement7 == null || (asJsonObject12 = jsonElement7.getAsJsonObject()) == null) ? viewEvent : TickerKt.fromJsonObject(asJsonObject12);
                JsonElement jsonElement8 = jsonObject.get("account");
                Account fromJsonObject5 = (jsonElement8 == null || (asJsonObject11 = jsonElement8.getAsJsonObject()) == null) ? viewEvent : DeepLinkSpec.Companion.fromJsonObject(asJsonObject11);
                JsonElement jsonElement9 = jsonObject.get("connectivity");
                Connectivity fromJsonObject6 = (jsonElement9 == null || (asJsonObject10 = jsonElement9.getAsJsonObject()) == null) ? viewEvent : zzkn.fromJsonObject(asJsonObject10);
                JsonElement jsonElement10 = jsonObject.get("display");
                Display fromJsonObject7 = (jsonElement10 == null || (asJsonObject9 = jsonElement10.getAsJsonObject()) == null) ? viewEvent : Keyboards.fromJsonObject(asJsonObject9);
                JsonElement jsonElement11 = jsonObject.get("synthetics");
                Synthetics fromJsonObject8 = (jsonElement11 == null || (asJsonObject8 = jsonElement11.getAsJsonObject()) == null) ? viewEvent : TakeUntilKt.fromJsonObject(asJsonObject8);
                JsonElement jsonElement12 = jsonObject.get("ci_test");
                CiTest fromJsonObject9 = (jsonElement12 == null || (asJsonObject7 = jsonElement12.getAsJsonObject()) == null) ? viewEvent : UtilsKt.fromJsonObject(asJsonObject7);
                JsonElement jsonElement13 = jsonObject.get("os");
                Os fromJsonObject10 = (jsonElement13 == null || (asJsonObject6 = jsonElement13.getAsJsonObject()) == null) ? viewEvent : StringsKt.fromJsonObject(asJsonObject6);
                JsonElement jsonElement14 = jsonObject.get("device");
                Device fromJsonObject11 = (jsonElement14 == null || (asJsonObject5 = jsonElement14.getAsJsonObject()) == null) ? viewEvent : Intents.fromJsonObject(asJsonObject5);
                JsonObject asJsonObject16 = jsonObject.get("_dd").getAsJsonObject();
                asJsonObject16.getClass();
                Dd fromJsonObject12 = MathsKt.fromJsonObject(asJsonObject16);
                JsonElement jsonElement15 = jsonObject.get("context");
                Context fromJsonObject13 = (jsonElement15 == null || (asJsonObject4 = jsonElement15.getAsJsonObject()) == null) ? viewEvent : EntitySyncerKt.fromJsonObject(asJsonObject4);
                JsonElement jsonElement16 = jsonObject.get("container");
                Container fromJsonObject14 = (jsonElement16 == null || (asJsonObject3 = jsonElement16.getAsJsonObject()) == null) ? viewEvent : zzko.fromJsonObject(asJsonObject3);
                String asString7 = jsonObject.get("type").getAsString();
                JsonElement jsonElement17 = jsonObject.get("feature_flags");
                Context fromJsonObject15 = (jsonElement17 == null || (asJsonObject2 = jsonElement17.getAsJsonObject()) == null) ? viewEvent : EntitySyncerKt.fromJsonObject(asJsonObject2);
                JsonElement jsonElement18 = jsonObject.get("privacy");
                Privacy fromJsonObject16 = (jsonElement18 == null || (asJsonObject = jsonElement18.getAsJsonObject()) == null) ? viewEvent : ProgressBarKt.fromJsonObject(asJsonObject);
                if (Intrinsics.areEqual(asString7, "view")) {
                    return new ViewEvent(asLong, fromJsonObject, asString2, asString3, asString4, asString5, asString6, fromJsonObject2, i, fromJsonObject3, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, fromJsonObject8, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13, fromJsonObject14, fromJsonObject15, fromJsonObject16);
                }
                throw new IllegalStateException("Check failed.");
            } catch (IllegalStateException e4) {
                e = e4;
                viewEvent = null;
            } catch (NullPointerException e5) {
                e = e5;
                viewEvent = null;
            } catch (NumberFormatException e6) {
                e = e6;
                viewEvent = null;
            }
        }
    }

    public final class Configuration {
        public final Number profilingSampleRate;
        public final Number sessionReplaySampleRate;
        public final Number sessionSampleRate;
        public final Boolean startSessionReplayRecordingManually;

        public Configuration(Number number, Number number2, Number number3, Boolean bool) {
            number.getClass();
            this.sessionSampleRate = number;
            this.sessionReplaySampleRate = number2;
            this.profilingSampleRate = number3;
            this.startSessionReplayRecordingManually = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return Intrinsics.areEqual(this.sessionSampleRate, configuration.sessionSampleRate) && Intrinsics.areEqual(this.sessionReplaySampleRate, configuration.sessionReplaySampleRate) && Intrinsics.areEqual(this.profilingSampleRate, configuration.profilingSampleRate) && Intrinsics.areEqual(this.startSessionReplayRecordingManually, configuration.startSessionReplayRecordingManually);
        }

        public final int hashCode() {
            int hashCode = this.sessionSampleRate.hashCode() * 31;
            Number number = this.sessionReplaySampleRate;
            int hashCode2 = (hashCode + (number == null ? 0 : number.hashCode())) * 31;
            Number number2 = this.profilingSampleRate;
            int hashCode3 = (hashCode2 + (number2 == null ? 0 : number2.hashCode())) * 31;
            Boolean bool = this.startSessionReplayRecordingManually;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "Configuration(sessionSampleRate=" + this.sessionSampleRate + ", sessionReplaySampleRate=" + this.sessionReplaySampleRate + ", profilingSampleRate=" + this.profilingSampleRate + ", startSessionReplayRecordingManually=" + this.startSessionReplayRecordingManually + ")";
        }
    }

    public final class Connectivity {
        public final Cellular cellular;
        public final int effectiveType;
        public final List interfaces;
        public final int status;

        public Connectivity(int i, List list, int i2, Cellular cellular) {
            if (i == 0) {
                throw null;
            }
            this.status = i;
            this.interfaces = list;
            this.effectiveType = i2;
            this.cellular = cellular;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connectivity)) {
                return false;
            }
            Connectivity connectivity = (Connectivity) obj;
            return this.status == connectivity.status && Intrinsics.areEqual(this.interfaces, connectivity.interfaces) && this.effectiveType == connectivity.effectiveType && Intrinsics.areEqual(this.cellular, connectivity.cellular);
        }

        public final int hashCode() {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.status) * 31;
            List list = this.interfaces;
            int hashCode = (ordinal + (list == null ? 0 : list.hashCode())) * 31;
            int i = this.effectiveType;
            int ordinal2 = (hashCode + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31;
            Cellular cellular = this.cellular;
            return ordinal2 + (cellular != null ? cellular.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Connectivity(status=");
            String str = "null";
            int i = this.status;
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "MAYBE" : "NOT_CONNECTED" : "CONNECTED");
            sb.append(", interfaces=");
            sb.append(this.interfaces);
            sb.append(", effectiveType=");
            int i2 = this.effectiveType;
            if (i2 == 1) {
                str = "SLOW_2G";
            } else if (i2 == 2) {
                str = "2G";
            } else if (i2 == 3) {
                str = "3G";
            } else if (i2 == 4) {
                str = "4G";
            }
            sb.append(str);
            sb.append(", cellular=");
            sb.append(this.cellular);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Container {
        public final int source;
        public final ContainerView view;

        public Container(ContainerView containerView, int i) {
            if (i == 0) {
                throw null;
            }
            this.view = containerView;
            this.source = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Container)) {
                return false;
            }
            Container container = (Container) obj;
            return this.view.equals(container.view) && this.source == container.source;
        }

        public final int hashCode() {
            return CameraSelector$$ExternalSyntheticOutline0.ordinal(this.source) + (this.view.id.hashCode() * 31);
        }

        public final String toString() {
            return "Container(view=" + this.view + ", source=" + ViewEvent$State$EnumUnboxingLocalUtility.stringValueOf$4(this.source) + ")";
        }
    }

    public final class ContainerView {
        public final String id;

        public ContainerView(String str) {
            str.getClass();
            this.id = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContainerView) && Intrinsics.areEqual(this.id, ((ContainerView) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContainerView(id=", this.id, ")");
        }
    }

    public final class Context {
        public final LinkedHashMap additionalProperties;

        public Context(LinkedHashMap linkedHashMap) {
            this.additionalProperties = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Context) && this.additionalProperties.equals(((Context) obj).additionalProperties);
        }

        public final int hashCode() {
            return this.additionalProperties.hashCode();
        }

        public final JsonObject toJson() {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry entry : this.additionalProperties.entrySet()) {
                jsonObject.add((String) entry.getKey(), JsonSerializer.toJsonElement(entry.getValue()));
            }
            return jsonObject;
        }

        public final String toString() {
            return "Context(additionalProperties=" + this.additionalProperties + ")";
        }
    }

    public final class Crash {
        public final long count;

        public Crash(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Crash) && this.count == ((Crash) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "Crash(count=", ")");
        }
    }

    public final class CustomTimings {
        public final LinkedHashMap additionalProperties;

        public CustomTimings(LinkedHashMap linkedHashMap) {
            this.additionalProperties = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomTimings) && this.additionalProperties.equals(((CustomTimings) obj).additionalProperties);
        }

        public final int hashCode() {
            return this.additionalProperties.hashCode();
        }

        public final String toString() {
            return "CustomTimings(additionalProperties=" + this.additionalProperties + ")";
        }
    }

    public final class Dd {
        public final String browserSdkVersion;
        public final DdCls cls;
        public final Configuration configuration;
        public final long documentVersion;
        public final List pageStates;
        public final Profiling profiling;
        public final ReplayStats replayStats;
        public final String sdkName;
        public final DdSession session;

        public Dd(DdSession ddSession, Configuration configuration, String str, String str2, long j, List list, ReplayStats replayStats, DdCls ddCls, Profiling profiling) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.sdkName = str2;
            this.documentVersion = j;
            this.pageStates = list;
            this.replayStats = replayStats;
            this.cls = ddCls;
            this.profiling = profiling;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dd)) {
                return false;
            }
            Dd dd = (Dd) obj;
            return Intrinsics.areEqual(this.session, dd.session) && Intrinsics.areEqual(this.configuration, dd.configuration) && Intrinsics.areEqual(this.browserSdkVersion, dd.browserSdkVersion) && Intrinsics.areEqual(this.sdkName, dd.sdkName) && this.documentVersion == dd.documentVersion && Intrinsics.areEqual(this.pageStates, dd.pageStates) && Intrinsics.areEqual(this.replayStats, dd.replayStats) && Intrinsics.areEqual(this.cls, dd.cls) && Intrinsics.areEqual(this.profiling, dd.profiling);
        }

        public final int hashCode() {
            DdSession ddSession = this.session;
            int hashCode = (ddSession == null ? 0 : ddSession.hashCode()) * 31;
            Configuration configuration = this.configuration;
            int hashCode2 = (hashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            String str = this.browserSdkVersion;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sdkName;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.documentVersion);
            List list = this.pageStates;
            int hashCode4 = (m + (list == null ? 0 : list.hashCode())) * 31;
            ReplayStats replayStats = this.replayStats;
            int hashCode5 = (hashCode4 + (replayStats == null ? 0 : replayStats.hashCode())) * 31;
            DdCls ddCls = this.cls;
            int hashCode6 = (hashCode5 + (ddCls == null ? 0 : ddCls.hashCode())) * 31;
            Profiling profiling = this.profiling;
            return hashCode6 + (profiling != null ? profiling.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dd(session=");
            sb.append(this.session);
            sb.append(", configuration=");
            sb.append(this.configuration);
            sb.append(", browserSdkVersion=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.browserSdkVersion, ", sdkName=", this.sdkName, ", documentVersion=");
            sb.append(this.documentVersion);
            sb.append(", pageStates=");
            sb.append(this.pageStates);
            sb.append(", replayStats=");
            sb.append(this.replayStats);
            sb.append(", cls=");
            sb.append(this.cls);
            sb.append(", profiling=");
            sb.append(this.profiling);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class DdCls {
        public final Number devicePixelRatio;

        public DdCls(Number number) {
            this.devicePixelRatio = number;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DdCls) && Intrinsics.areEqual(this.devicePixelRatio, ((DdCls) obj).devicePixelRatio);
        }

        public final int hashCode() {
            Number number = this.devicePixelRatio;
            if (number == null) {
                return 0;
            }
            return number.hashCode();
        }

        public final String toString() {
            return "DdCls(devicePixelRatio=" + this.devicePixelRatio + ")";
        }
    }

    public final class DdSession {
        public final Plan plan;
        public final int sessionPrecondition;

        public DdSession(Plan plan, int i) {
            this.plan = plan;
            this.sessionPrecondition = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DdSession)) {
                return false;
            }
            DdSession ddSession = (DdSession) obj;
            return this.plan == ddSession.plan && this.sessionPrecondition == ddSession.sessionPrecondition;
        }

        public final int hashCode() {
            Plan plan = this.plan;
            int hashCode = (plan == null ? 0 : plan.hashCode()) * 31;
            int i = this.sessionPrecondition;
            return hashCode + (i != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i) : 0);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("DdSession(plan=");
            sb.append(this.plan);
            sb.append(", sessionPrecondition=");
            switch (this.sessionPrecondition) {
                case 1:
                    str = "USER_APP_LAUNCH";
                    break;
                case 2:
                    str = "INACTIVITY_TIMEOUT";
                    break;
                case 3:
                    str = "MAX_DURATION";
                    break;
                case 4:
                    str = "BACKGROUND_LAUNCH";
                    break;
                case 5:
                    str = "PREWARM";
                    break;
                case 6:
                    str = "FROM_NON_INTERACTIVE_SESSION";
                    break;
                case 7:
                    str = "EXPLICIT_STOP";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Device {
        public final String architecture;
        public final Number batteryLevel;
        public final String brand;
        public final Number brightnessLevel;
        public final String locale;
        public final List locales;
        public final String model;
        public final String name;
        public final Boolean powerSavingMode;
        public final String timeZone;

        /* renamed from: type, reason: collision with root package name */
        public final int f970type;

        public Device(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, Number number, Boolean bool, Number number2) {
            this.f970type = i;
            this.name = str;
            this.model = str2;
            this.brand = str3;
            this.architecture = str4;
            this.locale = str5;
            this.locales = list;
            this.timeZone = str6;
            this.batteryLevel = number;
            this.powerSavingMode = bool;
            this.brightnessLevel = number2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return false;
            }
            Device device = (Device) obj;
            return this.f970type == device.f970type && Intrinsics.areEqual(this.name, device.name) && Intrinsics.areEqual(this.model, device.model) && Intrinsics.areEqual(this.brand, device.brand) && Intrinsics.areEqual(this.architecture, device.architecture) && Intrinsics.areEqual(this.locale, device.locale) && Intrinsics.areEqual(this.locales, device.locales) && Intrinsics.areEqual(this.timeZone, device.timeZone) && Intrinsics.areEqual(this.batteryLevel, device.batteryLevel) && Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel);
        }

        public final int hashCode() {
            int i = this.f970type;
            int ordinal = (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) * 31;
            String str = this.name;
            int hashCode = (ordinal + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.model;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.brand;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.architecture;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List list = this.locales;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str6 = this.timeZone;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Number number = this.batteryLevel;
            int hashCode8 = (hashCode7 + (number == null ? 0 : number.hashCode())) * 31;
            Boolean bool = this.powerSavingMode;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Number number2 = this.brightnessLevel;
            return hashCode9 + (number2 != null ? number2.hashCode() : 0);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("Device(type=");
            switch (this.f970type) {
                case 1:
                    str = "MOBILE";
                    break;
                case 2:
                    str = "DESKTOP";
                    break;
                case 3:
                    str = "TABLET";
                    break;
                case 4:
                    str = "TV";
                    break;
                case 5:
                    str = "GAMING_CONSOLE";
                    break;
                case 6:
                    str = "BOT";
                    break;
                case 7:
                    str = "OTHER";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", model=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.model, ", brand=", this.brand, ", architecture=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.architecture, ", locale=", this.locale, ", locales=");
            Recorder$$ExternalSyntheticOutline2.m(", timeZone=", this.timeZone, ", batteryLevel=", sb, this.locales);
            sb.append(this.batteryLevel);
            sb.append(", powerSavingMode=");
            sb.append(this.powerSavingMode);
            sb.append(", brightnessLevel=");
            sb.append(this.brightnessLevel);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Display {
        public final Scroll scroll;
        public final Viewport viewport;

        public Display(Viewport viewport, Scroll scroll) {
            this.viewport = viewport;
            this.scroll = scroll;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Display)) {
                return false;
            }
            Display display = (Display) obj;
            return Intrinsics.areEqual(this.viewport, display.viewport) && Intrinsics.areEqual(this.scroll, display.scroll);
        }

        public final int hashCode() {
            Viewport viewport = this.viewport;
            int hashCode = (viewport == null ? 0 : viewport.hashCode()) * 31;
            Scroll scroll = this.scroll;
            return hashCode + (scroll != null ? scroll.hashCode() : 0);
        }

        public final String toString() {
            return "Display(viewport=" + this.viewport + ", scroll=" + this.scroll + ")";
        }
    }

    public final class Error {
        public final long count;

        public Error(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.count == ((Error) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "Error(count=", ")");
        }
    }

    public final class Fbc {
        public final long timestamp;

        public Fbc(long j) {
            this.timestamp = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fbc) && this.timestamp == ((Fbc) obj).timestamp;
        }

        public final int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.timestamp, "Fbc(timestamp=", ")");
        }
    }

    public final class Fcp {
        public final long timestamp;

        public Fcp(long j) {
            this.timestamp = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fcp) && this.timestamp == ((Fcp) obj).timestamp;
        }

        public final int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.timestamp, "Fcp(timestamp=", ")");
        }
    }

    public final class Fid {
        public final long duration;
        public final String targetSelector;
        public final long timestamp;

        public Fid(long j, long j2, String str) {
            this.duration = j;
            this.timestamp = j2;
            this.targetSelector = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fid)) {
                return false;
            }
            Fid fid = (Fid) obj;
            return this.duration == fid.duration && this.timestamp == fid.timestamp && Intrinsics.areEqual(this.targetSelector, fid.targetSelector);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.duration) * 31, 31, this.timestamp);
            String str = this.targetSelector;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.duration, "Fid(duration=", ", timestamp=");
            Fragment$5$$ExternalSyntheticOutline0.m(this.timestamp, ", targetSelector=", this.targetSelector, m1149m);
            m1149m.append(")");
            return m1149m.toString();
        }
    }

    public final class FlutterBuildTime {
        public final Number average;
        public final Number max;
        public final Number metricMax;
        public final Number min;

        public FlutterBuildTime(Number number, Number number2, Number number3, Number number4) {
            number.getClass();
            number2.getClass();
            number3.getClass();
            this.min = number;
            this.max = number2;
            this.average = number3;
            this.metricMax = number4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterBuildTime)) {
                return false;
            }
            FlutterBuildTime flutterBuildTime = (FlutterBuildTime) obj;
            return Intrinsics.areEqual(this.min, flutterBuildTime.min) && Intrinsics.areEqual(this.max, flutterBuildTime.max) && Intrinsics.areEqual(this.average, flutterBuildTime.average) && Intrinsics.areEqual(this.metricMax, flutterBuildTime.metricMax);
        }

        public final int hashCode() {
            int hashCode = (this.average.hashCode() + ((this.max.hashCode() + (this.min.hashCode() * 31)) * 31)) * 31;
            Number number = this.metricMax;
            return hashCode + (number == null ? 0 : number.hashCode());
        }

        public final JsonObject toJson() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("min", this.min);
            jsonObject.addProperty("max", this.max);
            jsonObject.addProperty("average", this.average);
            Number number = this.metricMax;
            if (number != null) {
                jsonObject.addProperty("metric_max", number);
            }
            return jsonObject;
        }

        public final String toString() {
            return "FlutterBuildTime(min=" + this.min + ", max=" + this.max + ", average=" + this.average + ", metricMax=" + this.metricMax + ")";
        }
    }

    public final class FrozenFrame {
        public final long count;

        public FrozenFrame(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FrozenFrame) && this.count == ((FrozenFrame) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "FrozenFrame(count=", ")");
        }
    }

    public final class Frustration {
        public final long count;

        public Frustration(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Frustration) && this.count == ((Frustration) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "Frustration(count=", ")");
        }
    }

    public final class InForegroundPeriod {
        public final long duration;
        public final long start;

        public InForegroundPeriod(long j, long j2) {
            this.start = j;
            this.duration = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InForegroundPeriod)) {
                return false;
            }
            InForegroundPeriod inForegroundPeriod = (InForegroundPeriod) obj;
            return this.start == inForegroundPeriod.start && this.duration == inForegroundPeriod.duration;
        }

        public final int hashCode() {
            return Long.hashCode(this.duration) + (Long.hashCode(this.start) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.duration, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.start, "InForegroundPeriod(start=", ", duration="));
        }
    }

    public final class Inp {
        public final long duration;
        public final String targetSelector;
        public final Long timestamp;

        public Inp(long j, Long l, String str) {
            this.duration = j;
            this.timestamp = l;
            this.targetSelector = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inp)) {
                return false;
            }
            Inp inp = (Inp) obj;
            return this.duration == inp.duration && Intrinsics.areEqual(this.timestamp, inp.timestamp) && Intrinsics.areEqual(this.targetSelector, inp.targetSelector);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.duration) * 31;
            Long l = this.timestamp;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.targetSelector;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Inp(duration=");
            sb.append(this.duration);
            sb.append(", timestamp=");
            sb.append(this.timestamp);
            return Recorder$$ExternalSyntheticOutline2.m(sb, ", targetSelector=", this.targetSelector, ")");
        }
    }

    public enum Interface {
        BLUETOOTH("bluetooth"),
        CELLULAR("cellular"),
        ETHERNET("ethernet"),
        WIFI("wifi"),
        WIMAX("wimax"),
        /* JADX INFO: Fake field, exist only in values array */
        MIXED("mixed"),
        OTHER("other"),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN("unknown"),
        /* JADX INFO: Fake field, exist only in values array */
        NONE("none");

        public final String jsonValue;

        Interface(String str) {
            this.jsonValue = str;
        }
    }

    public final class Lcp {
        public final String resourceUrl;
        public final String targetSelector;
        public final long timestamp;

        public Lcp(long j, String str, String str2) {
            this.timestamp = j;
            this.targetSelector = str;
            this.resourceUrl = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Lcp)) {
                return false;
            }
            Lcp lcp = (Lcp) obj;
            return this.timestamp == lcp.timestamp && Intrinsics.areEqual(this.targetSelector, lcp.targetSelector) && Intrinsics.areEqual(this.resourceUrl, lcp.resourceUrl);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.timestamp) * 31;
            String str = this.targetSelector;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.resourceUrl;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(re$$ExternalSyntheticOutline0.m("Lcp(timestamp=", this.timestamp, ", targetSelector=", this.targetSelector), ", resourceUrl=", this.resourceUrl, ")");
        }
    }

    public final class LongTask {
        public final long count;

        public LongTask(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LongTask) && this.count == ((LongTask) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "LongTask(count=", ")");
        }
    }

    public final class Os {
        public final String build;
        public final String name;
        public final String version;
        public final String versionMajor;

        public Os(String str, String str2, String str3, String str4) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
            this.name = str;
            this.version = str2;
            this.build = str3;
            this.versionMajor = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Os)) {
                return false;
            }
            Os os = (Os) obj;
            return Intrinsics.areEqual(this.name, os.name) && Intrinsics.areEqual(this.version, os.version) && Intrinsics.areEqual(this.build, os.build) && Intrinsics.areEqual(this.versionMajor, os.versionMajor);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.version);
            String str = this.build;
            return this.versionMajor.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Os(name=", this.name, ", version=", this.version, ", build="), this.build, ", versionMajor=", this.versionMajor, ")");
        }
    }

    public final class PageState {
        public final long start;
        public final int state;

        public PageState(int i, long j) {
            if (i == 0) {
                throw null;
            }
            this.state = i;
            this.start = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageState)) {
                return false;
            }
            PageState pageState = (PageState) obj;
            return this.state == pageState.state && this.start == pageState.start;
        }

        public final int hashCode() {
            return Long.hashCode(this.start) + (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.state) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageState(state=");
            int i = this.state;
            sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TERMINATED" : "FROZEN" : "HIDDEN" : "PASSIVE" : "ACTIVE");
            sb.append(", start=");
            sb.append(this.start);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Performance {
        public final PerformanceCls cls;
        public final Fbc fbc;
        public final Fcp fcp;
        public final Fid fid;
        public final Inp inp;
        public final Lcp lcp;

        public Performance(PerformanceCls performanceCls, Fcp fcp, Fid fid, Inp inp, Lcp lcp, Fbc fbc) {
            this.cls = performanceCls;
            this.fcp = fcp;
            this.fid = fid;
            this.inp = inp;
            this.lcp = lcp;
            this.fbc = fbc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Performance)) {
                return false;
            }
            Performance performance = (Performance) obj;
            return Intrinsics.areEqual(this.cls, performance.cls) && Intrinsics.areEqual(this.fcp, performance.fcp) && Intrinsics.areEqual(this.fid, performance.fid) && Intrinsics.areEqual(this.inp, performance.inp) && Intrinsics.areEqual(this.lcp, performance.lcp) && Intrinsics.areEqual(this.fbc, performance.fbc);
        }

        public final int hashCode() {
            PerformanceCls performanceCls = this.cls;
            int hashCode = (performanceCls == null ? 0 : performanceCls.hashCode()) * 31;
            Fcp fcp = this.fcp;
            int hashCode2 = (hashCode + (fcp == null ? 0 : Long.hashCode(fcp.timestamp))) * 31;
            Fid fid = this.fid;
            int hashCode3 = (hashCode2 + (fid == null ? 0 : fid.hashCode())) * 31;
            Inp inp = this.inp;
            int hashCode4 = (hashCode3 + (inp == null ? 0 : inp.hashCode())) * 31;
            Lcp lcp = this.lcp;
            int hashCode5 = (hashCode4 + (lcp == null ? 0 : lcp.hashCode())) * 31;
            Fbc fbc = this.fbc;
            return hashCode5 + (fbc != null ? Long.hashCode(fbc.timestamp) : 0);
        }

        public final String toString() {
            return "Performance(cls=" + this.cls + ", fcp=" + this.fcp + ", fid=" + this.fid + ", inp=" + this.inp + ", lcp=" + this.lcp + ", fbc=" + this.fbc + ")";
        }
    }

    public final class PerformanceCls {
        public final PreviousRect currentRect;
        public final PreviousRect previousRect;
        public final Number score;
        public final String targetSelector;
        public final Long timestamp;

        public PerformanceCls(Number number, Long l, String str, PreviousRect previousRect, PreviousRect previousRect2) {
            number.getClass();
            this.score = number;
            this.timestamp = l;
            this.targetSelector = str;
            this.previousRect = previousRect;
            this.currentRect = previousRect2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PerformanceCls)) {
                return false;
            }
            PerformanceCls performanceCls = (PerformanceCls) obj;
            return Intrinsics.areEqual(this.score, performanceCls.score) && Intrinsics.areEqual(this.timestamp, performanceCls.timestamp) && Intrinsics.areEqual(this.targetSelector, performanceCls.targetSelector) && Intrinsics.areEqual(this.previousRect, performanceCls.previousRect) && Intrinsics.areEqual(this.currentRect, performanceCls.currentRect);
        }

        public final int hashCode() {
            int hashCode = this.score.hashCode() * 31;
            Long l = this.timestamp;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.targetSelector;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            PreviousRect previousRect = this.previousRect;
            int hashCode4 = (hashCode3 + (previousRect == null ? 0 : previousRect.hashCode())) * 31;
            PreviousRect previousRect2 = this.currentRect;
            return hashCode4 + (previousRect2 != null ? previousRect2.hashCode() : 0);
        }

        public final String toString() {
            return "PerformanceCls(score=" + this.score + ", timestamp=" + this.timestamp + ", targetSelector=" + this.targetSelector + ", previousRect=" + this.previousRect + ", currentRect=" + this.currentRect + ")";
        }
    }

    /* loaded from: classes8.dex */
    public enum Plan {
        /* JADX INFO: Fake field, exist only in values array */
        EF10("PLAN_1"),
        /* JADX INFO: Fake field, exist only in values array */
        EF22("PLAN_2");

        public final Integer jsonValue;

        Plan(String str) {
            this.jsonValue = r2;
        }
    }

    public final class PreviousRect {
        public final Number height;
        public final Number width;
        public final Number x;
        public final Number y;

        public PreviousRect(Number number, Number number2, Number number3, Number number4) {
            number.getClass();
            number2.getClass();
            number3.getClass();
            number4.getClass();
            this.x = number;
            this.y = number2;
            this.width = number3;
            this.height = number4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreviousRect)) {
                return false;
            }
            PreviousRect previousRect = (PreviousRect) obj;
            return Intrinsics.areEqual(this.x, previousRect.x) && Intrinsics.areEqual(this.y, previousRect.y) && Intrinsics.areEqual(this.width, previousRect.width) && Intrinsics.areEqual(this.height, previousRect.height);
        }

        public final int hashCode() {
            return this.height.hashCode() + ((this.width.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31)) * 31);
        }

        public final JsonObject toJson() {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("x", this.x);
            jsonObject.addProperty("y", this.y);
            jsonObject.addProperty("width", this.width);
            jsonObject.addProperty("height", this.height);
            return jsonObject;
        }

        public final String toString() {
            return "PreviousRect(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ")";
        }
    }

    public final class Privacy {
        public final int replayLevel;

        public Privacy(int i) {
            if (i == 0) {
                throw null;
            }
            this.replayLevel = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Privacy) && this.replayLevel == ((Privacy) obj).replayLevel;
        }

        public final int hashCode() {
            return CameraSelector$$ExternalSyntheticOutline0.ordinal(this.replayLevel);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Privacy(replayLevel=");
            int i = this.replayLevel;
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "MASK_USER_INPUT" : "MASK" : "ALLOW");
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Profiling {
        public final int errorReason;
        public final int status;

        public Profiling(int i, int i2) {
            this.status = i;
            this.errorReason = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Profiling)) {
                return false;
            }
            Profiling profiling = (Profiling) obj;
            return this.status == profiling.status && this.errorReason == profiling.errorReason;
        }

        public final int hashCode() {
            int i = this.status;
            int ordinal = (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) * 31;
            int i2 = this.errorReason;
            return ordinal + (i2 != 0 ? CameraSelector$$ExternalSyntheticOutline0.ordinal(i2) : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Profiling(status=");
            String str = "null";
            int i = this.status;
            sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "ERROR" : "STOPPED" : "RUNNING" : "STARTING");
            sb.append(", errorReason=");
            int i2 = this.errorReason;
            if (i2 == 1) {
                str = "NOT_SUPPORTED_BY_BROWSER";
            } else if (i2 == 2) {
                str = "FAILED_TO_LAZY_LOAD";
            } else if (i2 == 3) {
                str = "MISSING_DOCUMENT_POLICY_HEADER";
            } else if (i2 == 4) {
                str = "UNEXPECTED_EXCEPTION";
            }
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class ReplayStats {
        public final Long recordsCount;
        public final Long segmentsCount;
        public final Long segmentsTotalRawSize;

        public ReplayStats(Long l, Long l2, Long l3) {
            this.recordsCount = l;
            this.segmentsCount = l2;
            this.segmentsTotalRawSize = l3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReplayStats)) {
                return false;
            }
            ReplayStats replayStats = (ReplayStats) obj;
            return Intrinsics.areEqual(this.recordsCount, replayStats.recordsCount) && Intrinsics.areEqual(this.segmentsCount, replayStats.segmentsCount) && Intrinsics.areEqual(this.segmentsTotalRawSize, replayStats.segmentsTotalRawSize);
        }

        public final int hashCode() {
            Long l = this.recordsCount;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.segmentsCount;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.segmentsTotalRawSize;
            return hashCode2 + (l3 != null ? l3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReplayStats(recordsCount=");
            sb.append(this.recordsCount);
            sb.append(", segmentsCount=");
            sb.append(this.segmentsCount);
            sb.append(", segmentsTotalRawSize=");
            return Thread$State$EnumUnboxingLocalUtility.m(sb, this.segmentsTotalRawSize, ")");
        }
    }

    public final class Resource {
        public final long count;

        public Resource(long j) {
            this.count = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resource) && this.count == ((Resource) obj).count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "Resource(count=", ")");
        }
    }

    public final class Scroll {
        public final Number maxDepth;
        public final Number maxDepthScrollTop;
        public final Number maxScrollHeight;
        public final Number maxScrollHeightTime;

        public Scroll(Number number, Number number2, Number number3, Number number4) {
            number.getClass();
            number2.getClass();
            number3.getClass();
            number4.getClass();
            this.maxDepth = number;
            this.maxDepthScrollTop = number2;
            this.maxScrollHeight = number3;
            this.maxScrollHeightTime = number4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Scroll)) {
                return false;
            }
            Scroll scroll = (Scroll) obj;
            return Intrinsics.areEqual(this.maxDepth, scroll.maxDepth) && Intrinsics.areEqual(this.maxDepthScrollTop, scroll.maxDepthScrollTop) && Intrinsics.areEqual(this.maxScrollHeight, scroll.maxScrollHeight) && Intrinsics.areEqual(this.maxScrollHeightTime, scroll.maxScrollHeightTime);
        }

        public final int hashCode() {
            return this.maxScrollHeightTime.hashCode() + ((this.maxScrollHeight.hashCode() + ((this.maxDepthScrollTop.hashCode() + (this.maxDepth.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Scroll(maxDepth=" + this.maxDepth + ", maxDepthScrollTop=" + this.maxDepthScrollTop + ", maxScrollHeight=" + this.maxScrollHeight + ", maxScrollHeightTime=" + this.maxScrollHeightTime + ")";
        }
    }

    public final class SlowFrame {
        public final long duration;
        public final long start;

        public SlowFrame(long j, long j2) {
            this.start = j;
            this.duration = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlowFrame)) {
                return false;
            }
            SlowFrame slowFrame = (SlowFrame) obj;
            return this.start == slowFrame.start && this.duration == slowFrame.duration;
        }

        public final int hashCode() {
            return Long.hashCode(this.duration) + (Long.hashCode(this.start) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.duration, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.start, "SlowFrame(start=", ", duration="));
        }
    }

    public final class Synthetics {
        public final Boolean injected;
        public final String resultId;
        public final String testId;

        public Synthetics(String str, String str2, Boolean bool) {
            str.getClass();
            str2.getClass();
            this.testId = str;
            this.resultId = str2;
            this.injected = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Synthetics)) {
                return false;
            }
            Synthetics synthetics = (Synthetics) obj;
            return Intrinsics.areEqual(this.testId, synthetics.testId) && Intrinsics.areEqual(this.resultId, synthetics.resultId) && Intrinsics.areEqual(this.injected, synthetics.injected);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.testId.hashCode() * 31, 31, this.resultId);
            Boolean bool = this.injected;
            return m + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Synthetics(testId=", this.testId, ", resultId=", this.resultId, ", injected="), this.injected, ")");
        }
    }

    public final class Usr {
        public static final String[] RESERVED_PROPERTIES = {"id", "name", "email", "anonymous_id"};
        public final Map additionalProperties;
        public final String anonymousId;
        public final String email;
        public final String id;
        public final String name;

        public Usr(String str, String str2, String str3, String str4, Map map) {
            this.id = str;
            this.name = str2;
            this.email = str3;
            this.anonymousId = str4;
            this.additionalProperties = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Usr)) {
                return false;
            }
            Usr usr = (Usr) obj;
            return Intrinsics.areEqual(this.id, usr.id) && Intrinsics.areEqual(this.name, usr.name) && Intrinsics.areEqual(this.email, usr.email) && Intrinsics.areEqual(this.anonymousId, usr.anonymousId) && this.additionalProperties.equals(usr.additionalProperties);
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.email;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.anonymousId;
            return this.additionalProperties.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Usr(id=", this.id, ", name=", this.name, ", email=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.email, ", anonymousId=", this.anonymousId, ", additionalProperties=");
            return re$$ExternalSyntheticOutline0.m(")", m, this.additionalProperties);
        }
    }

    public final class ViewEventSession {
        public final Boolean hasReplay;
        public final String id;
        public final Boolean isActive;
        public final Boolean sampledForReplay;

        /* renamed from: type, reason: collision with root package name */
        public final int f971type;

        public ViewEventSession(String str, int i, Boolean bool, Boolean bool2, Boolean bool3) {
            str.getClass();
            if (i == 0) {
                throw null;
            }
            this.id = str;
            this.f971type = i;
            this.hasReplay = bool;
            this.isActive = bool2;
            this.sampledForReplay = bool3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewEventSession)) {
                return false;
            }
            ViewEventSession viewEventSession = (ViewEventSession) obj;
            return Intrinsics.areEqual(this.id, viewEventSession.id) && this.f971type == viewEventSession.f971type && Intrinsics.areEqual(this.hasReplay, viewEventSession.hasReplay) && Intrinsics.areEqual(this.isActive, viewEventSession.isActive) && Intrinsics.areEqual(this.sampledForReplay, viewEventSession.sampledForReplay);
        }

        public final int hashCode() {
            int m = Thread$State$EnumUnboxingLocalUtility.m(this.f971type, this.id.hashCode() * 31, 31);
            Boolean bool = this.hasReplay;
            int hashCode = (m + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isActive;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.sampledForReplay;
            return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("ViewEventSession(id=", this.id, ", type=");
            int i = this.f971type;
            m3m.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CI_TEST" : "SYNTHETICS" : "USER");
            m3m.append(", hasReplay=");
            m3m.append(this.hasReplay);
            m3m.append(", isActive=");
            m3m.append(this.isActive);
            m3m.append(", sampledForReplay=");
            m3m.append(this.sampledForReplay);
            m3m.append(")");
            return m3m.toString();
        }
    }

    public final class ViewEventView {
        public final Accessibility accessibility;
        public final Action action;
        public final Number cpuTicksCount;
        public final Number cpuTicksPerSecond;
        public final Crash crash;
        public final Number cumulativeLayoutShift;
        public final String cumulativeLayoutShiftTargetSelector;
        public final Long cumulativeLayoutShiftTime;
        public final CustomTimings customTimings;
        public final Long domComplete;
        public final Long domContentLoaded;
        public final Long domInteractive;
        public final Error error;
        public final Long firstByte;
        public final Long firstContentfulPaint;
        public final Long firstInputDelay;
        public final String firstInputTargetSelector;
        public final Long firstInputTime;
        public final FlutterBuildTime flutterBuildTime;
        public final FlutterBuildTime flutterRasterTime;
        public final Number freezeRate;
        public final FrozenFrame frozenFrame;
        public final Frustration frustration;
        public final String id;
        public final List inForegroundPeriods;
        public final Long interactionToNextPaint;
        public final String interactionToNextPaintTargetSelector;
        public final Long interactionToNextPaintTime;
        public final Long interactionToNextViewTime;
        public final Boolean isActive;
        public final Boolean isSlowRendered;
        public final FlutterBuildTime jsRefreshRate;
        public final Long largestContentfulPaint;
        public final String largestContentfulPaintTargetSelector;
        public final Long loadEvent;
        public final Long loadingTime;
        public final int loadingType;
        public final LongTask longTask;
        public final Number memoryAverage;
        public final Number memoryMax;
        public final String name;
        public final Long networkSettledTime;
        public final Performance performance;
        public final String referrer;
        public final Number refreshRateAverage;
        public final Number refreshRateMin;
        public final Resource resource;
        public final List slowFrames;
        public final Number slowFramesRate;
        public final long timeSpent;
        public final String url;

        public ViewEventView(String str, String str2, String str3, String str4, Long l, Long l2, Long l3, int i, long j, Long l4, Long l5, String str5, Long l6, Long l7, String str6, Long l8, Long l9, String str7, Number number, Long l10, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, CustomTimings customTimings, Boolean bool, Boolean bool2, Action action, Error error, Crash crash, LongTask longTask, FrozenFrame frozenFrame, List list, Resource resource, Frustration frustration, List list2, Number number2, Number number3, Number number4, Number number5, Number number6, Number number7, Number number8, Number number9, FlutterBuildTime flutterBuildTime, FlutterBuildTime flutterBuildTime2, FlutterBuildTime flutterBuildTime3, Performance performance, Accessibility accessibility) {
            str.getClass();
            str3.getClass();
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
            this.loadingTime = l;
            this.networkSettledTime = l2;
            this.interactionToNextViewTime = l3;
            this.loadingType = i;
            this.timeSpent = j;
            this.firstContentfulPaint = l4;
            this.largestContentfulPaint = l5;
            this.largestContentfulPaintTargetSelector = str5;
            this.firstInputDelay = l6;
            this.firstInputTime = l7;
            this.firstInputTargetSelector = str6;
            this.interactionToNextPaint = l8;
            this.interactionToNextPaintTime = l9;
            this.interactionToNextPaintTargetSelector = str7;
            this.cumulativeLayoutShift = number;
            this.cumulativeLayoutShiftTime = l10;
            this.cumulativeLayoutShiftTargetSelector = str8;
            this.domComplete = l11;
            this.domContentLoaded = l12;
            this.domInteractive = l13;
            this.loadEvent = l14;
            this.firstByte = l15;
            this.customTimings = customTimings;
            this.isActive = bool;
            this.isSlowRendered = bool2;
            this.action = action;
            this.error = error;
            this.crash = crash;
            this.longTask = longTask;
            this.frozenFrame = frozenFrame;
            this.slowFrames = list;
            this.resource = resource;
            this.frustration = frustration;
            this.inForegroundPeriods = list2;
            this.memoryAverage = number2;
            this.memoryMax = number3;
            this.cpuTicksCount = number4;
            this.cpuTicksPerSecond = number5;
            this.refreshRateAverage = number6;
            this.refreshRateMin = number7;
            this.slowFramesRate = number8;
            this.freezeRate = number9;
            this.flutterBuildTime = flutterBuildTime;
            this.flutterRasterTime = flutterBuildTime2;
            this.jsRefreshRate = flutterBuildTime3;
            this.performance = performance;
            this.accessibility = accessibility;
        }

        public static ViewEventView copy$default(ViewEventView viewEventView, CustomTimings customTimings, Crash crash, int i) {
            Long l;
            CustomTimings customTimings2;
            Boolean bool = Boolean.FALSE;
            String str = viewEventView.id;
            String str2 = viewEventView.referrer;
            String str3 = viewEventView.url;
            String str4 = viewEventView.name;
            Long l2 = viewEventView.loadingTime;
            Long l3 = viewEventView.networkSettledTime;
            Long l4 = viewEventView.interactionToNextViewTime;
            int i2 = viewEventView.loadingType;
            long j = viewEventView.timeSpent;
            Long l5 = viewEventView.firstContentfulPaint;
            Long l6 = viewEventView.largestContentfulPaint;
            String str5 = viewEventView.largestContentfulPaintTargetSelector;
            Long l7 = viewEventView.firstInputDelay;
            Long l8 = viewEventView.firstInputTime;
            String str6 = viewEventView.firstInputTargetSelector;
            Long l9 = viewEventView.interactionToNextPaint;
            Long l10 = viewEventView.interactionToNextPaintTime;
            String str7 = viewEventView.interactionToNextPaintTargetSelector;
            Number number = viewEventView.cumulativeLayoutShift;
            Long l11 = viewEventView.cumulativeLayoutShiftTime;
            String str8 = viewEventView.cumulativeLayoutShiftTargetSelector;
            Long l12 = viewEventView.domComplete;
            Long l13 = viewEventView.domContentLoaded;
            Long l14 = viewEventView.domInteractive;
            Long l15 = viewEventView.loadEvent;
            Long l16 = viewEventView.firstByte;
            if ((i & 67108864) != 0) {
                l = l16;
                customTimings2 = viewEventView.customTimings;
            } else {
                l = l16;
                customTimings2 = customTimings;
            }
            Boolean bool2 = (i & 134217728) != 0 ? viewEventView.isActive : bool;
            Boolean bool3 = viewEventView.isSlowRendered;
            Action action = viewEventView.action;
            Error error = viewEventView.error;
            Crash crash2 = (i & PKIFailureInfo.systemUnavail) != 0 ? viewEventView.crash : crash;
            LongTask longTask = viewEventView.longTask;
            FrozenFrame frozenFrame = viewEventView.frozenFrame;
            List list = viewEventView.slowFrames;
            Resource resource = viewEventView.resource;
            Frustration frustration = viewEventView.frustration;
            List list2 = viewEventView.inForegroundPeriods;
            Number number2 = viewEventView.memoryAverage;
            Number number3 = viewEventView.memoryMax;
            Number number4 = viewEventView.cpuTicksCount;
            Number number5 = viewEventView.cpuTicksPerSecond;
            Number number6 = viewEventView.refreshRateAverage;
            Number number7 = viewEventView.refreshRateMin;
            Number number8 = viewEventView.slowFramesRate;
            Number number9 = viewEventView.freezeRate;
            FlutterBuildTime flutterBuildTime = viewEventView.flutterBuildTime;
            FlutterBuildTime flutterBuildTime2 = viewEventView.flutterRasterTime;
            FlutterBuildTime flutterBuildTime3 = viewEventView.jsRefreshRate;
            Performance performance = viewEventView.performance;
            Accessibility accessibility = viewEventView.accessibility;
            str.getClass();
            str3.getClass();
            return new ViewEventView(str, str2, str3, str4, l2, l3, l4, i2, j, l5, l6, str5, l7, l8, str6, l9, l10, str7, number, l11, str8, l12, l13, l14, l15, l, customTimings2, bool2, bool3, action, error, crash2, longTask, frozenFrame, list, resource, frustration, list2, number2, number3, number4, number5, number6, number7, number8, number9, flutterBuildTime, flutterBuildTime2, flutterBuildTime3, performance, accessibility);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewEventView)) {
                return false;
            }
            ViewEventView viewEventView = (ViewEventView) obj;
            return Intrinsics.areEqual(this.id, viewEventView.id) && Intrinsics.areEqual(this.referrer, viewEventView.referrer) && Intrinsics.areEqual(this.url, viewEventView.url) && Intrinsics.areEqual(this.name, viewEventView.name) && Intrinsics.areEqual(this.loadingTime, viewEventView.loadingTime) && Intrinsics.areEqual(this.networkSettledTime, viewEventView.networkSettledTime) && Intrinsics.areEqual(this.interactionToNextViewTime, viewEventView.interactionToNextViewTime) && this.loadingType == viewEventView.loadingType && this.timeSpent == viewEventView.timeSpent && Intrinsics.areEqual(this.firstContentfulPaint, viewEventView.firstContentfulPaint) && Intrinsics.areEqual(this.largestContentfulPaint, viewEventView.largestContentfulPaint) && Intrinsics.areEqual(this.largestContentfulPaintTargetSelector, viewEventView.largestContentfulPaintTargetSelector) && Intrinsics.areEqual(this.firstInputDelay, viewEventView.firstInputDelay) && Intrinsics.areEqual(this.firstInputTime, viewEventView.firstInputTime) && Intrinsics.areEqual(this.firstInputTargetSelector, viewEventView.firstInputTargetSelector) && Intrinsics.areEqual(this.interactionToNextPaint, viewEventView.interactionToNextPaint) && Intrinsics.areEqual(this.interactionToNextPaintTime, viewEventView.interactionToNextPaintTime) && Intrinsics.areEqual(this.interactionToNextPaintTargetSelector, viewEventView.interactionToNextPaintTargetSelector) && Intrinsics.areEqual(this.cumulativeLayoutShift, viewEventView.cumulativeLayoutShift) && Intrinsics.areEqual(this.cumulativeLayoutShiftTime, viewEventView.cumulativeLayoutShiftTime) && Intrinsics.areEqual(this.cumulativeLayoutShiftTargetSelector, viewEventView.cumulativeLayoutShiftTargetSelector) && Intrinsics.areEqual(this.domComplete, viewEventView.domComplete) && Intrinsics.areEqual(this.domContentLoaded, viewEventView.domContentLoaded) && Intrinsics.areEqual(this.domInteractive, viewEventView.domInteractive) && Intrinsics.areEqual(this.loadEvent, viewEventView.loadEvent) && Intrinsics.areEqual(this.firstByte, viewEventView.firstByte) && Intrinsics.areEqual(this.customTimings, viewEventView.customTimings) && Intrinsics.areEqual(this.isActive, viewEventView.isActive) && Intrinsics.areEqual(this.isSlowRendered, viewEventView.isSlowRendered) && this.action.equals(viewEventView.action) && this.error.equals(viewEventView.error) && Intrinsics.areEqual(this.crash, viewEventView.crash) && Intrinsics.areEqual(this.longTask, viewEventView.longTask) && Intrinsics.areEqual(this.frozenFrame, viewEventView.frozenFrame) && Intrinsics.areEqual(this.slowFrames, viewEventView.slowFrames) && this.resource.equals(viewEventView.resource) && Intrinsics.areEqual(this.frustration, viewEventView.frustration) && Intrinsics.areEqual(this.inForegroundPeriods, viewEventView.inForegroundPeriods) && Intrinsics.areEqual(this.memoryAverage, viewEventView.memoryAverage) && Intrinsics.areEqual(this.memoryMax, viewEventView.memoryMax) && Intrinsics.areEqual(this.cpuTicksCount, viewEventView.cpuTicksCount) && Intrinsics.areEqual(this.cpuTicksPerSecond, viewEventView.cpuTicksPerSecond) && Intrinsics.areEqual(this.refreshRateAverage, viewEventView.refreshRateAverage) && Intrinsics.areEqual(this.refreshRateMin, viewEventView.refreshRateMin) && Intrinsics.areEqual(this.slowFramesRate, viewEventView.slowFramesRate) && Intrinsics.areEqual(this.freezeRate, viewEventView.freezeRate) && Intrinsics.areEqual(this.flutterBuildTime, viewEventView.flutterBuildTime) && Intrinsics.areEqual(this.flutterRasterTime, viewEventView.flutterRasterTime) && Intrinsics.areEqual(this.jsRefreshRate, viewEventView.jsRefreshRate) && Intrinsics.areEqual(this.performance, viewEventView.performance) && Intrinsics.areEqual(this.accessibility, viewEventView.accessibility);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.referrer;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.url);
            String str2 = this.name;
            int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.loadingTime;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.networkSettledTime;
            int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.interactionToNextViewTime;
            int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
            int i = this.loadingType;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31, 31, this.timeSpent);
            Long l4 = this.firstContentfulPaint;
            int hashCode6 = (m2 + (l4 == null ? 0 : l4.hashCode())) * 31;
            Long l5 = this.largestContentfulPaint;
            int hashCode7 = (hashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
            String str3 = this.largestContentfulPaintTargetSelector;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l6 = this.firstInputDelay;
            int hashCode9 = (hashCode8 + (l6 == null ? 0 : l6.hashCode())) * 31;
            Long l7 = this.firstInputTime;
            int hashCode10 = (hashCode9 + (l7 == null ? 0 : l7.hashCode())) * 31;
            String str4 = this.firstInputTargetSelector;
            int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l8 = this.interactionToNextPaint;
            int hashCode12 = (hashCode11 + (l8 == null ? 0 : l8.hashCode())) * 31;
            Long l9 = this.interactionToNextPaintTime;
            int hashCode13 = (hashCode12 + (l9 == null ? 0 : l9.hashCode())) * 31;
            String str5 = this.interactionToNextPaintTargetSelector;
            int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Number number = this.cumulativeLayoutShift;
            int hashCode15 = (hashCode14 + (number == null ? 0 : number.hashCode())) * 31;
            Long l10 = this.cumulativeLayoutShiftTime;
            int hashCode16 = (hashCode15 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str6 = this.cumulativeLayoutShiftTargetSelector;
            int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l11 = this.domComplete;
            int hashCode18 = (hashCode17 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.domContentLoaded;
            int hashCode19 = (hashCode18 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.domInteractive;
            int hashCode20 = (hashCode19 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.loadEvent;
            int hashCode21 = (hashCode20 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.firstByte;
            int hashCode22 = (hashCode21 + (l15 == null ? 0 : l15.hashCode())) * 31;
            CustomTimings customTimings = this.customTimings;
            int hashCode23 = (hashCode22 + (customTimings == null ? 0 : customTimings.additionalProperties.hashCode())) * 31;
            Boolean bool = this.isActive;
            int hashCode24 = (hashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isSlowRendered;
            int m3 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.action.count), 31, this.error.count);
            Crash crash = this.crash;
            int hashCode25 = (m3 + (crash == null ? 0 : Long.hashCode(crash.count))) * 31;
            LongTask longTask = this.longTask;
            int hashCode26 = (hashCode25 + (longTask == null ? 0 : Long.hashCode(longTask.count))) * 31;
            FrozenFrame frozenFrame = this.frozenFrame;
            int hashCode27 = (hashCode26 + (frozenFrame == null ? 0 : Long.hashCode(frozenFrame.count))) * 31;
            List list = this.slowFrames;
            int m4 = Recorder$$ExternalSyntheticOutline2.m((hashCode27 + (list == null ? 0 : list.hashCode())) * 31, 31, this.resource.count);
            Frustration frustration = this.frustration;
            int hashCode28 = (m4 + (frustration == null ? 0 : Long.hashCode(frustration.count))) * 31;
            List list2 = this.inForegroundPeriods;
            int hashCode29 = (hashCode28 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Number number2 = this.memoryAverage;
            int hashCode30 = (hashCode29 + (number2 == null ? 0 : number2.hashCode())) * 31;
            Number number3 = this.memoryMax;
            int hashCode31 = (hashCode30 + (number3 == null ? 0 : number3.hashCode())) * 31;
            Number number4 = this.cpuTicksCount;
            int hashCode32 = (hashCode31 + (number4 == null ? 0 : number4.hashCode())) * 31;
            Number number5 = this.cpuTicksPerSecond;
            int hashCode33 = (hashCode32 + (number5 == null ? 0 : number5.hashCode())) * 31;
            Number number6 = this.refreshRateAverage;
            int hashCode34 = (hashCode33 + (number6 == null ? 0 : number6.hashCode())) * 31;
            Number number7 = this.refreshRateMin;
            int hashCode35 = (hashCode34 + (number7 == null ? 0 : number7.hashCode())) * 31;
            Number number8 = this.slowFramesRate;
            int hashCode36 = (hashCode35 + (number8 == null ? 0 : number8.hashCode())) * 31;
            Number number9 = this.freezeRate;
            int hashCode37 = (hashCode36 + (number9 == null ? 0 : number9.hashCode())) * 31;
            FlutterBuildTime flutterBuildTime = this.flutterBuildTime;
            int hashCode38 = (hashCode37 + (flutterBuildTime == null ? 0 : flutterBuildTime.hashCode())) * 31;
            FlutterBuildTime flutterBuildTime2 = this.flutterRasterTime;
            int hashCode39 = (hashCode38 + (flutterBuildTime2 == null ? 0 : flutterBuildTime2.hashCode())) * 31;
            FlutterBuildTime flutterBuildTime3 = this.jsRefreshRate;
            int hashCode40 = (hashCode39 + (flutterBuildTime3 == null ? 0 : flutterBuildTime3.hashCode())) * 31;
            Performance performance = this.performance;
            int hashCode41 = (hashCode40 + (performance == null ? 0 : performance.hashCode())) * 31;
            Accessibility accessibility = this.accessibility;
            return hashCode41 + (accessibility != null ? accessibility.hashCode() : 0);
        }

        public final String toString() {
            String str;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ViewEventView(id=", this.id, ", referrer=", this.referrer, ", url=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.url, ", name=", this.name, ", loadingTime=");
            Thread$State$EnumUnboxingLocalUtility.m(m, this.loadingTime, ", networkSettledTime=", this.networkSettledTime, ", interactionToNextViewTime=");
            m.append(this.interactionToNextViewTime);
            m.append(", loadingType=");
            switch (this.loadingType) {
                case 1:
                    str = "INITIAL_LOAD";
                    break;
                case 2:
                    str = "ROUTE_CHANGE";
                    break;
                case 3:
                    str = "ACTIVITY_DISPLAY";
                    break;
                case 4:
                    str = "ACTIVITY_REDISPLAY";
                    break;
                case 5:
                    str = "FRAGMENT_DISPLAY";
                    break;
                case 6:
                    str = "FRAGMENT_REDISPLAY";
                    break;
                case 7:
                    str = "VIEW_CONTROLLER_DISPLAY";
                    break;
                case 8:
                    str = "VIEW_CONTROLLER_REDISPLAY";
                    break;
                default:
                    str = "null";
                    break;
            }
            m.append(str);
            m.append(", timeSpent=");
            m.append(this.timeSpent);
            m.append(", firstContentfulPaint=");
            m.append(this.firstContentfulPaint);
            m.append(", largestContentfulPaint=");
            m.append(this.largestContentfulPaint);
            m.append(", largestContentfulPaintTargetSelector=");
            m.append(this.largestContentfulPaintTargetSelector);
            m.append(", firstInputDelay=");
            m.append(this.firstInputDelay);
            m.append(", firstInputTime=");
            m.append(this.firstInputTime);
            m.append(", firstInputTargetSelector=");
            m.append(this.firstInputTargetSelector);
            m.append(", interactionToNextPaint=");
            m.append(this.interactionToNextPaint);
            m.append(", interactionToNextPaintTime=");
            m.append(this.interactionToNextPaintTime);
            m.append(", interactionToNextPaintTargetSelector=");
            m.append(this.interactionToNextPaintTargetSelector);
            m.append(", cumulativeLayoutShift=");
            m.append(this.cumulativeLayoutShift);
            m.append(", cumulativeLayoutShiftTime=");
            m.append(this.cumulativeLayoutShiftTime);
            m.append(", cumulativeLayoutShiftTargetSelector=");
            m.append(this.cumulativeLayoutShiftTargetSelector);
            m.append(", domComplete=");
            m.append(this.domComplete);
            m.append(", domContentLoaded=");
            m.append(this.domContentLoaded);
            m.append(", domInteractive=");
            m.append(this.domInteractive);
            m.append(", loadEvent=");
            m.append(this.loadEvent);
            m.append(", firstByte=");
            m.append(this.firstByte);
            m.append(", customTimings=");
            m.append(this.customTimings);
            m.append(", isActive=");
            m.append(this.isActive);
            m.append(", isSlowRendered=");
            m.append(this.isSlowRendered);
            m.append(", action=");
            m.append(this.action);
            m.append(", error=");
            m.append(this.error);
            m.append(", crash=");
            m.append(this.crash);
            m.append(", longTask=");
            m.append(this.longTask);
            m.append(", frozenFrame=");
            m.append(this.frozenFrame);
            m.append(", slowFrames=");
            m.append(this.slowFrames);
            m.append(", resource=");
            m.append(this.resource);
            m.append(", frustration=");
            m.append(this.frustration);
            m.append(", inForegroundPeriods=");
            m.append(this.inForegroundPeriods);
            m.append(", memoryAverage=");
            m.append(this.memoryAverage);
            m.append(", memoryMax=");
            m.append(this.memoryMax);
            m.append(", cpuTicksCount=");
            m.append(this.cpuTicksCount);
            m.append(", cpuTicksPerSecond=");
            m.append(this.cpuTicksPerSecond);
            m.append(", refreshRateAverage=");
            m.append(this.refreshRateAverage);
            m.append(", refreshRateMin=");
            m.append(this.refreshRateMin);
            m.append(", slowFramesRate=");
            m.append(this.slowFramesRate);
            m.append(", freezeRate=");
            m.append(this.freezeRate);
            m.append(", flutterBuildTime=");
            m.append(this.flutterBuildTime);
            m.append(", flutterRasterTime=");
            m.append(this.flutterRasterTime);
            m.append(", jsRefreshRate=");
            m.append(this.jsRefreshRate);
            m.append(", performance=");
            m.append(this.performance);
            m.append(", accessibility=");
            m.append(this.accessibility);
            m.append(")");
            return m.toString();
        }
    }

    public final class Viewport {
        public final Number height;
        public final Number width;

        public Viewport(Number number, Number number2) {
            number.getClass();
            number2.getClass();
            this.width = number;
            this.height = number2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Viewport)) {
                return false;
            }
            Viewport viewport = (Viewport) obj;
            return Intrinsics.areEqual(this.width, viewport.width) && Intrinsics.areEqual(this.height, viewport.height);
        }

        public final int hashCode() {
            return this.height.hashCode() + (this.width.hashCode() * 31);
        }

        public final String toString() {
            return "Viewport(width=" + this.width + ", height=" + this.height + ")";
        }
    }

    public ViewEvent(long j, Application application, String str, String str2, String str3, String str4, String str5, ViewEventSession viewEventSession, int i, ViewEventView viewEventView, Usr usr, Account account, Connectivity connectivity, Display display, Synthetics synthetics, CiTest ciTest, Os os, Device device, Dd dd, Context context, Container container, Context context2, Privacy privacy) {
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.ddtags = str5;
        this.session = viewEventSession;
        this.source = i;
        this.view = viewEventView;
        this.usr = usr;
        this.account = account;
        this.connectivity = connectivity;
        this.display = display;
        this.synthetics = synthetics;
        this.ciTest = ciTest;
        this.os = os;
        this.device = device;
        this.dd = dd;
        this.context = context;
        this.container = container;
        this.featureFlags = context2;
        this.privacy = privacy;
    }

    public static ViewEvent copy$default(ViewEvent viewEvent, ViewEventView viewEventView, Usr usr, Account account, Dd dd, Context context, int i) {
        Device device;
        Dd dd2;
        long j = viewEvent.date;
        Application application = viewEvent.application;
        String str = viewEvent.service;
        String str2 = viewEvent.version;
        String str3 = viewEvent.buildVersion;
        String str4 = viewEvent.buildId;
        String str5 = viewEvent.ddtags;
        ViewEventSession viewEventSession = viewEvent.session;
        int i2 = viewEvent.source;
        Usr usr2 = (i & 1024) != 0 ? viewEvent.usr : usr;
        Account account2 = (i & 2048) != 0 ? viewEvent.account : account;
        Connectivity connectivity = viewEvent.connectivity;
        Display display = viewEvent.display;
        Synthetics synthetics = viewEvent.synthetics;
        CiTest ciTest = viewEvent.ciTest;
        Os os = viewEvent.os;
        Device device2 = viewEvent.device;
        if ((i & PKIFailureInfo.transactionIdInUse) != 0) {
            device = device2;
            dd2 = viewEvent.dd;
        } else {
            device = device2;
            dd2 = dd;
        }
        Context context2 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? viewEvent.context : context;
        Container container = viewEvent.container;
        Context context3 = viewEvent.featureFlags;
        Privacy privacy = viewEvent.privacy;
        viewEvent.getClass();
        return new ViewEvent(j, application, str, str2, str3, str4, str5, viewEventSession, i2, viewEventView, usr2, account2, connectivity, display, synthetics, ciTest, os, device, dd2, context2, container, context3, privacy);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewEvent)) {
            return false;
        }
        ViewEvent viewEvent = (ViewEvent) obj;
        return this.date == viewEvent.date && this.application.equals(viewEvent.application) && Intrinsics.areEqual(this.service, viewEvent.service) && Intrinsics.areEqual(this.version, viewEvent.version) && Intrinsics.areEqual(this.buildVersion, viewEvent.buildVersion) && Intrinsics.areEqual(this.buildId, viewEvent.buildId) && Intrinsics.areEqual(this.ddtags, viewEvent.ddtags) && this.session.equals(viewEvent.session) && this.source == viewEvent.source && this.view.equals(viewEvent.view) && Intrinsics.areEqual(this.usr, viewEvent.usr) && Intrinsics.areEqual(this.account, viewEvent.account) && Intrinsics.areEqual(this.connectivity, viewEvent.connectivity) && Intrinsics.areEqual(this.display, viewEvent.display) && Intrinsics.areEqual(this.synthetics, viewEvent.synthetics) && Intrinsics.areEqual(this.ciTest, viewEvent.ciTest) && Intrinsics.areEqual(this.os, viewEvent.os) && Intrinsics.areEqual(this.device, viewEvent.device) && this.dd.equals(viewEvent.dd) && Intrinsics.areEqual(this.context, viewEvent.context) && Intrinsics.areEqual(this.container, viewEvent.container) && Intrinsics.areEqual(this.featureFlags, viewEvent.featureFlags) && Intrinsics.areEqual(this.privacy, viewEvent.privacy);
    }

    public final int hashCode() {
        int hashCode = (this.application.hashCode() + (Long.hashCode(this.date) * 31)) * 31;
        String str = this.service;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buildVersion;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buildId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ddtags;
        int hashCode6 = (this.session.hashCode() + ((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        int i = this.source;
        int hashCode7 = (this.view.hashCode() + ((hashCode6 + (i == 0 ? 0 : CameraSelector$$ExternalSyntheticOutline0.ordinal(i))) * 31)) * 31;
        Usr usr = this.usr;
        int hashCode8 = (hashCode7 + (usr == null ? 0 : usr.hashCode())) * 31;
        Account account = this.account;
        int hashCode9 = (hashCode8 + (account == null ? 0 : account.hashCode())) * 31;
        Connectivity connectivity = this.connectivity;
        int hashCode10 = (hashCode9 + (connectivity == null ? 0 : connectivity.hashCode())) * 31;
        Display display = this.display;
        int hashCode11 = (hashCode10 + (display == null ? 0 : display.hashCode())) * 31;
        Synthetics synthetics = this.synthetics;
        int hashCode12 = (hashCode11 + (synthetics == null ? 0 : synthetics.hashCode())) * 31;
        CiTest ciTest = this.ciTest;
        int hashCode13 = (hashCode12 + (ciTest == null ? 0 : ciTest.testExecutionId.hashCode())) * 31;
        Os os = this.os;
        int hashCode14 = (hashCode13 + (os == null ? 0 : os.hashCode())) * 31;
        Device device = this.device;
        int hashCode15 = (this.dd.hashCode() + ((hashCode14 + (device == null ? 0 : device.hashCode())) * 31)) * 31;
        Context context = this.context;
        int hashCode16 = (hashCode15 + (context == null ? 0 : context.additionalProperties.hashCode())) * 31;
        Container container = this.container;
        int hashCode17 = (hashCode16 + (container == null ? 0 : container.hashCode())) * 31;
        Context context2 = this.featureFlags;
        int hashCode18 = (hashCode17 + (context2 == null ? 0 : context2.additionalProperties.hashCode())) * 31;
        Privacy privacy = this.privacy;
        return hashCode18 + (privacy != null ? CameraSelector$$ExternalSyntheticOutline0.ordinal(privacy.replayLevel) : 0);
    }

    public final JsonObject toJson() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(InquiryField.DateField.TYPE, Long.valueOf(this.date));
        JsonObject jsonObject2 = new JsonObject();
        Application application = this.application;
        jsonObject2.addProperty("id", application.id);
        String str8 = application.currentLocale;
        if (str8 != null) {
            jsonObject2.addProperty("current_locale", str8);
        }
        jsonObject.add("application", jsonObject2);
        String str9 = this.service;
        if (str9 != null) {
            jsonObject.addProperty("service", str9);
        }
        String str10 = this.version;
        if (str10 != null) {
            jsonObject.addProperty("version", str10);
        }
        String str11 = this.buildVersion;
        if (str11 != null) {
            jsonObject.addProperty("build_version", str11);
        }
        String str12 = this.buildId;
        if (str12 != null) {
            jsonObject.addProperty("build_id", str12);
        }
        String str13 = this.ddtags;
        if (str13 != null) {
            jsonObject.addProperty("ddtags", str13);
        }
        JsonObject jsonObject3 = new JsonObject();
        ViewEventSession viewEventSession = this.session;
        jsonObject3.addProperty("id", viewEventSession.id);
        jsonObject3.add("type", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$3(viewEventSession.f971type)));
        Boolean bool = viewEventSession.hasReplay;
        if (bool != null) {
            jsonObject3.addProperty("has_replay", bool);
        }
        Boolean bool2 = viewEventSession.isActive;
        if (bool2 != null) {
            jsonObject3.addProperty("is_active", bool2);
        }
        Boolean bool3 = viewEventSession.sampledForReplay;
        if (bool3 != null) {
            jsonObject3.addProperty("sampled_for_replay", bool3);
        }
        String str14 = "session";
        jsonObject.add("session", jsonObject3);
        String str15 = "source";
        int i = this.source;
        if (i != 0) {
            jsonObject.add("source", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(i)));
        }
        JsonObject jsonObject4 = new JsonObject();
        ViewEventView viewEventView = this.view;
        jsonObject4.addProperty("id", viewEventView.id);
        String str16 = viewEventView.referrer;
        if (str16 != null) {
            jsonObject4.addProperty("referrer", str16);
        }
        jsonObject4.addProperty("url", viewEventView.url);
        String str17 = viewEventView.name;
        if (str17 != null) {
            jsonObject4.addProperty("name", str17);
        }
        Long l = viewEventView.loadingTime;
        if (l != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l, jsonObject4, "loading_time");
        }
        Long l2 = viewEventView.networkSettledTime;
        if (l2 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l2, jsonObject4, "network_settled_time");
        }
        Long l3 = viewEventView.interactionToNextViewTime;
        if (l3 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l3, jsonObject4, "interaction_to_next_view_time");
        }
        int i2 = viewEventView.loadingType;
        if (i2 != 0) {
            jsonObject4.add("loading_type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$28(i2)));
        }
        jsonObject4.addProperty("time_spent", Long.valueOf(viewEventView.timeSpent));
        Long l4 = viewEventView.firstContentfulPaint;
        if (l4 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l4, jsonObject4, "first_contentful_paint");
        }
        Long l5 = viewEventView.largestContentfulPaint;
        if (l5 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l5, jsonObject4, "largest_contentful_paint");
        }
        String str18 = viewEventView.largestContentfulPaintTargetSelector;
        if (str18 != null) {
            jsonObject4.addProperty("largest_contentful_paint_target_selector", str18);
        }
        Long l6 = viewEventView.firstInputDelay;
        if (l6 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l6, jsonObject4, "first_input_delay");
        }
        Long l7 = viewEventView.firstInputTime;
        if (l7 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l7, jsonObject4, "first_input_time");
        }
        String str19 = viewEventView.firstInputTargetSelector;
        if (str19 != null) {
            jsonObject4.addProperty("first_input_target_selector", str19);
        }
        Long l8 = viewEventView.interactionToNextPaint;
        if (l8 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l8, jsonObject4, "interaction_to_next_paint");
        }
        Long l9 = viewEventView.interactionToNextPaintTime;
        if (l9 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l9, jsonObject4, "interaction_to_next_paint_time");
        }
        String str20 = viewEventView.interactionToNextPaintTargetSelector;
        if (str20 != null) {
            jsonObject4.addProperty("interaction_to_next_paint_target_selector", str20);
        }
        Number number = viewEventView.cumulativeLayoutShift;
        if (number != null) {
            jsonObject4.addProperty("cumulative_layout_shift", number);
        }
        Long l10 = viewEventView.cumulativeLayoutShiftTime;
        if (l10 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l10, jsonObject4, "cumulative_layout_shift_time");
        }
        String str21 = viewEventView.cumulativeLayoutShiftTargetSelector;
        if (str21 != null) {
            jsonObject4.addProperty("cumulative_layout_shift_target_selector", str21);
        }
        Long l11 = viewEventView.domComplete;
        if (l11 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l11, jsonObject4, "dom_complete");
        }
        Long l12 = viewEventView.domContentLoaded;
        if (l12 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l12, jsonObject4, "dom_content_loaded");
        }
        Long l13 = viewEventView.domInteractive;
        if (l13 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l13, jsonObject4, "dom_interactive");
        }
        Long l14 = viewEventView.loadEvent;
        if (l14 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l14, jsonObject4, "load_event");
        }
        Long l15 = viewEventView.firstByte;
        if (l15 != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l15, jsonObject4, "first_byte");
        }
        CustomTimings customTimings = viewEventView.customTimings;
        if (customTimings != null) {
            JsonObject jsonObject5 = new JsonObject();
            for (Map.Entry entry : customTimings.additionalProperties.entrySet()) {
                jsonObject5.addProperty((String) entry.getKey(), Long.valueOf(((Number) entry.getValue()).longValue()));
            }
            jsonObject4.add("custom_timings", jsonObject5);
        }
        Boolean bool4 = viewEventView.isActive;
        if (bool4 != null) {
            jsonObject4.addProperty("is_active", bool4);
        }
        Boolean bool5 = viewEventView.isSlowRendered;
        if (bool5 != null) {
            jsonObject4.addProperty("is_slow_rendered", bool5);
        }
        Action action = viewEventView.action;
        JsonObject jsonObject6 = new JsonObject();
        jsonObject6.addProperty("count", Long.valueOf(action.count));
        jsonObject4.add("action", jsonObject6);
        Error error = viewEventView.error;
        JsonObject jsonObject7 = new JsonObject();
        jsonObject7.addProperty("count", Long.valueOf(error.count));
        jsonObject4.add(BreadcrumbHelper.Category.ERROR, jsonObject7);
        Crash crash = viewEventView.crash;
        if (crash != null) {
            JsonObject jsonObject8 = new JsonObject();
            jsonObject8.addProperty("count", Long.valueOf(crash.count));
            jsonObject4.add("crash", jsonObject8);
        }
        LongTask longTask = viewEventView.longTask;
        if (longTask != null) {
            JsonObject jsonObject9 = new JsonObject();
            jsonObject9.addProperty("count", Long.valueOf(longTask.count));
            jsonObject4.add("long_task", jsonObject9);
        }
        FrozenFrame frozenFrame = viewEventView.frozenFrame;
        if (frozenFrame != null) {
            JsonObject jsonObject10 = new JsonObject();
            jsonObject10.addProperty("count", Long.valueOf(frozenFrame.count));
            jsonObject4.add("frozen_frame", jsonObject10);
        }
        List list = viewEventView.slowFrames;
        if (list != null) {
            JsonArray jsonArray = new JsonArray(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SlowFrame slowFrame = (SlowFrame) it.next();
                slowFrame.getClass();
                Iterator it2 = it;
                JsonObject jsonObject11 = new JsonObject();
                jsonObject11.addProperty("start", Long.valueOf(slowFrame.start));
                jsonObject11.addProperty("duration", Long.valueOf(slowFrame.duration));
                jsonArray.add(jsonObject11);
                it = it2;
                str14 = str14;
                str15 = str15;
            }
            str = str15;
            str2 = str14;
            jsonObject4.add("slow_frames", jsonArray);
        } else {
            str = "source";
            str2 = "session";
        }
        Resource resource = viewEventView.resource;
        JsonObject jsonObject12 = new JsonObject();
        jsonObject12.addProperty("count", Long.valueOf(resource.count));
        jsonObject4.add("resource", jsonObject12);
        Frustration frustration = viewEventView.frustration;
        if (frustration != null) {
            JsonObject jsonObject13 = new JsonObject();
            jsonObject13.addProperty("count", Long.valueOf(frustration.count));
            jsonObject4.add("frustration", jsonObject13);
        }
        List<InForegroundPeriod> list2 = viewEventView.inForegroundPeriods;
        if (list2 != null) {
            JsonArray jsonArray2 = new JsonArray(list2.size());
            for (InForegroundPeriod inForegroundPeriod : list2) {
                inForegroundPeriod.getClass();
                JsonObject jsonObject14 = new JsonObject();
                jsonObject14.addProperty("start", Long.valueOf(inForegroundPeriod.start));
                jsonObject14.addProperty("duration", Long.valueOf(inForegroundPeriod.duration));
                jsonArray2.add(jsonObject14);
            }
            jsonObject4.add("in_foreground_periods", jsonArray2);
        }
        Number number2 = viewEventView.memoryAverage;
        if (number2 != null) {
            jsonObject4.addProperty("memory_average", number2);
        }
        Number number3 = viewEventView.memoryMax;
        if (number3 != null) {
            jsonObject4.addProperty("memory_max", number3);
        }
        Number number4 = viewEventView.cpuTicksCount;
        if (number4 != null) {
            jsonObject4.addProperty("cpu_ticks_count", number4);
        }
        Number number5 = viewEventView.cpuTicksPerSecond;
        if (number5 != null) {
            jsonObject4.addProperty("cpu_ticks_per_second", number5);
        }
        Number number6 = viewEventView.refreshRateAverage;
        if (number6 != null) {
            jsonObject4.addProperty("refresh_rate_average", number6);
        }
        Number number7 = viewEventView.refreshRateMin;
        if (number7 != null) {
            jsonObject4.addProperty("refresh_rate_min", number7);
        }
        Number number8 = viewEventView.slowFramesRate;
        if (number8 != null) {
            jsonObject4.addProperty("slow_frames_rate", number8);
        }
        Number number9 = viewEventView.freezeRate;
        if (number9 != null) {
            jsonObject4.addProperty("freeze_rate", number9);
        }
        FlutterBuildTime flutterBuildTime = viewEventView.flutterBuildTime;
        if (flutterBuildTime != null) {
            jsonObject4.add("flutter_build_time", flutterBuildTime.toJson());
        }
        FlutterBuildTime flutterBuildTime2 = viewEventView.flutterRasterTime;
        if (flutterBuildTime2 != null) {
            jsonObject4.add("flutter_raster_time", flutterBuildTime2.toJson());
        }
        FlutterBuildTime flutterBuildTime3 = viewEventView.jsRefreshRate;
        if (flutterBuildTime3 != null) {
            jsonObject4.add("js_refresh_rate", flutterBuildTime3.toJson());
        }
        Performance performance = viewEventView.performance;
        if (performance != null) {
            JsonObject jsonObject15 = new JsonObject();
            PerformanceCls performanceCls = performance.cls;
            if (performanceCls != null) {
                str5 = "start";
                JsonObject jsonObject16 = new JsonObject();
                str4 = "type";
                str3 = "version";
                jsonObject16.addProperty("score", performanceCls.score);
                Long l16 = performanceCls.timestamp;
                if (l16 != null) {
                    RumErrorSource$EnumUnboxingLocalUtility.m(l16, jsonObject16, "timestamp");
                }
                String str22 = performanceCls.targetSelector;
                if (str22 != null) {
                    jsonObject16.addProperty("target_selector", str22);
                }
                PreviousRect previousRect = performanceCls.previousRect;
                if (previousRect != null) {
                    jsonObject16.add("previous_rect", previousRect.toJson());
                }
                PreviousRect previousRect2 = performanceCls.currentRect;
                if (previousRect2 != null) {
                    jsonObject16.add("current_rect", previousRect2.toJson());
                }
                jsonObject15.add("cls", jsonObject16);
            } else {
                str3 = "version";
                str4 = "type";
                str5 = "start";
            }
            Fcp fcp = performance.fcp;
            if (fcp != null) {
                JsonObject jsonObject17 = new JsonObject();
                str6 = "name";
                jsonObject17.addProperty("timestamp", Long.valueOf(fcp.timestamp));
                jsonObject15.add("fcp", jsonObject17);
            } else {
                str6 = "name";
            }
            Fid fid = performance.fid;
            if (fid != null) {
                JsonObject jsonObject18 = new JsonObject();
                jsonObject18.addProperty("duration", Long.valueOf(fid.duration));
                jsonObject18.addProperty("timestamp", Long.valueOf(fid.timestamp));
                String str23 = fid.targetSelector;
                if (str23 != null) {
                    jsonObject18.addProperty("target_selector", str23);
                }
                jsonObject15.add("fid", jsonObject18);
            }
            Inp inp = performance.inp;
            if (inp != null) {
                JsonObject jsonObject19 = new JsonObject();
                jsonObject19.addProperty("duration", Long.valueOf(inp.duration));
                Long l17 = inp.timestamp;
                if (l17 != null) {
                    RumErrorSource$EnumUnboxingLocalUtility.m(l17, jsonObject19, "timestamp");
                }
                String str24 = inp.targetSelector;
                if (str24 != null) {
                    jsonObject19.addProperty("target_selector", str24);
                }
                jsonObject15.add("inp", jsonObject19);
            }
            Lcp lcp = performance.lcp;
            if (lcp != null) {
                JsonObject jsonObject20 = new JsonObject();
                jsonObject20.addProperty("timestamp", Long.valueOf(lcp.timestamp));
                String str25 = lcp.targetSelector;
                if (str25 != null) {
                    jsonObject20.addProperty("target_selector", str25);
                }
                String str26 = lcp.resourceUrl;
                if (str26 != null) {
                    jsonObject20.addProperty("resource_url", str26);
                }
                jsonObject15.add("lcp", jsonObject20);
            }
            Fbc fbc = performance.fbc;
            if (fbc != null) {
                JsonObject jsonObject21 = new JsonObject();
                jsonObject21.addProperty("timestamp", Long.valueOf(fbc.timestamp));
                jsonObject15.add("fbc", jsonObject21);
            }
            jsonObject4.add(BreadcrumbHelper.Category.PERFORMANCE, jsonObject15);
        } else {
            str3 = "version";
            str4 = "type";
            str5 = "start";
            str6 = "name";
        }
        Accessibility accessibility = viewEventView.accessibility;
        if (accessibility != null) {
            JsonObject jsonObject22 = new JsonObject();
            String str27 = accessibility.textSize;
            if (str27 != null) {
                jsonObject22.addProperty("text_size", str27);
            }
            Boolean bool6 = accessibility.screenReaderEnabled;
            if (bool6 != null) {
                jsonObject22.addProperty("screen_reader_enabled", bool6);
            }
            Boolean bool7 = accessibility.boldTextEnabled;
            if (bool7 != null) {
                jsonObject22.addProperty("bold_text_enabled", bool7);
            }
            Boolean bool8 = accessibility.reduceTransparencyEnabled;
            if (bool8 != null) {
                jsonObject22.addProperty("reduce_transparency_enabled", bool8);
            }
            Boolean bool9 = accessibility.reduceMotionEnabled;
            if (bool9 != null) {
                jsonObject22.addProperty("reduce_motion_enabled", bool9);
            }
            Boolean bool10 = accessibility.buttonShapesEnabled;
            if (bool10 != null) {
                jsonObject22.addProperty("button_shapes_enabled", bool10);
            }
            Boolean bool11 = accessibility.invertColorsEnabled;
            if (bool11 != null) {
                jsonObject22.addProperty("invert_colors_enabled", bool11);
            }
            Boolean bool12 = accessibility.increaseContrastEnabled;
            if (bool12 != null) {
                jsonObject22.addProperty("increase_contrast_enabled", bool12);
            }
            Boolean bool13 = accessibility.assistiveSwitchEnabled;
            if (bool13 != null) {
                jsonObject22.addProperty("assistive_switch_enabled", bool13);
            }
            Boolean bool14 = accessibility.assistiveTouchEnabled;
            if (bool14 != null) {
                jsonObject22.addProperty("assistive_touch_enabled", bool14);
            }
            Boolean bool15 = accessibility.videoAutoplayEnabled;
            if (bool15 != null) {
                jsonObject22.addProperty("video_autoplay_enabled", bool15);
            }
            Boolean bool16 = accessibility.closedCaptioningEnabled;
            if (bool16 != null) {
                jsonObject22.addProperty("closed_captioning_enabled", bool16);
            }
            Boolean bool17 = accessibility.monoAudioEnabled;
            if (bool17 != null) {
                jsonObject22.addProperty("mono_audio_enabled", bool17);
            }
            Boolean bool18 = accessibility.shakeToUndoEnabled;
            if (bool18 != null) {
                jsonObject22.addProperty("shake_to_undo_enabled", bool18);
            }
            Boolean bool19 = accessibility.reducedAnimationsEnabled;
            if (bool19 != null) {
                jsonObject22.addProperty("reduced_animations_enabled", bool19);
            }
            Boolean bool20 = accessibility.shouldDifferentiateWithoutColor;
            if (bool20 != null) {
                jsonObject22.addProperty("should_differentiate_without_color", bool20);
            }
            Boolean bool21 = accessibility.grayscaleEnabled;
            if (bool21 != null) {
                jsonObject22.addProperty("grayscale_enabled", bool21);
            }
            Boolean bool22 = accessibility.singleAppModeEnabled;
            if (bool22 != null) {
                jsonObject22.addProperty("single_app_mode_enabled", bool22);
            }
            Boolean bool23 = accessibility.onOffSwitchLabelsEnabled;
            if (bool23 != null) {
                jsonObject22.addProperty("on_off_switch_labels_enabled", bool23);
            }
            Boolean bool24 = accessibility.speakScreenEnabled;
            if (bool24 != null) {
                jsonObject22.addProperty("speak_screen_enabled", bool24);
            }
            Boolean bool25 = accessibility.speakSelectionEnabled;
            if (bool25 != null) {
                jsonObject22.addProperty("speak_selection_enabled", bool25);
            }
            Boolean bool26 = accessibility.rtlEnabled;
            if (bool26 != null) {
                jsonObject22.addProperty("rtl_enabled", bool26);
            }
            jsonObject4.add("accessibility", jsonObject22);
        }
        jsonObject.add("view", jsonObject4);
        Usr usr = this.usr;
        if (usr != null) {
            JsonObject jsonObject23 = new JsonObject();
            String str28 = usr.id;
            if (str28 != null) {
                jsonObject23.addProperty("id", str28);
            }
            String str29 = usr.name;
            if (str29 != null) {
                jsonObject23.addProperty(str6, str29);
            }
            String str30 = usr.email;
            if (str30 != null) {
                jsonObject23.addProperty("email", str30);
            }
            String str31 = usr.anonymousId;
            if (str31 != null) {
                jsonObject23.addProperty("anonymous_id", str31);
            }
            for (Map.Entry entry2 : usr.additionalProperties.entrySet()) {
                String str32 = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (!ArraysKt___ArraysKt.contains(Usr.RESERVED_PROPERTIES, str32)) {
                    jsonObject23.add(str32, JsonSerializer.toJsonElement(value));
                }
            }
            jsonObject.add("usr", jsonObject23);
        }
        Account account = this.account;
        if (account != null) {
            JsonObject jsonObject24 = new JsonObject();
            jsonObject24.addProperty("id", account.id);
            String str33 = account.name;
            if (str33 != null) {
                jsonObject24.addProperty(str6, str33);
            }
            for (Map.Entry entry3 : account.additionalProperties.entrySet()) {
                String str34 = (String) entry3.getKey();
                Object value2 = entry3.getValue();
                if (!ArraysKt___ArraysKt.contains(Account.RESERVED_PROPERTIES, str34)) {
                    jsonObject24.add(str34, JsonSerializer.toJsonElement(value2));
                }
            }
            jsonObject.add("account", jsonObject24);
        }
        Connectivity connectivity = this.connectivity;
        if (connectivity != null) {
            JsonObject jsonObject25 = new JsonObject();
            jsonObject25.add("status", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$24(connectivity.status)));
            List list3 = connectivity.interfaces;
            if (list3 != null) {
                JsonArray jsonArray3 = new JsonArray(list3.size());
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    jsonArray3.add(new JsonPrimitive(((Interface) it3.next()).jsonValue));
                }
                jsonObject25.add("interfaces", jsonArray3);
            }
            int i3 = connectivity.effectiveType;
            if (i3 != 0) {
                jsonObject25.add("effective_type", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$26(i3)));
            }
            Cellular cellular = connectivity.cellular;
            if (cellular != null) {
                JsonObject jsonObject26 = new JsonObject();
                String str35 = cellular.technology;
                if (str35 != null) {
                    jsonObject26.addProperty("technology", str35);
                }
                String str36 = cellular.carrierName;
                if (str36 != null) {
                    jsonObject26.addProperty("carrier_name", str36);
                }
                jsonObject25.add("cellular", jsonObject26);
            }
            jsonObject.add("connectivity", jsonObject25);
        }
        Display display = this.display;
        if (display != null) {
            JsonObject jsonObject27 = new JsonObject();
            Viewport viewport = display.viewport;
            if (viewport != null) {
                JsonObject jsonObject28 = new JsonObject();
                jsonObject28.addProperty("width", viewport.width);
                jsonObject28.addProperty("height", viewport.height);
                jsonObject27.add("viewport", jsonObject28);
            }
            Scroll scroll = display.scroll;
            if (scroll != null) {
                JsonObject jsonObject29 = new JsonObject();
                jsonObject29.addProperty("max_depth", scroll.maxDepth);
                jsonObject29.addProperty("max_depth_scroll_top", scroll.maxDepthScrollTop);
                jsonObject29.addProperty("max_scroll_height", scroll.maxScrollHeight);
                jsonObject29.addProperty("max_scroll_height_time", scroll.maxScrollHeightTime);
                jsonObject27.add("scroll", jsonObject29);
            }
            jsonObject.add("display", jsonObject27);
        }
        Synthetics synthetics = this.synthetics;
        if (synthetics != null) {
            JsonObject jsonObject30 = new JsonObject();
            jsonObject30.addProperty("test_id", synthetics.testId);
            jsonObject30.addProperty("result_id", synthetics.resultId);
            Boolean bool27 = synthetics.injected;
            if (bool27 != null) {
                jsonObject30.addProperty("injected", bool27);
            }
            jsonObject.add("synthetics", jsonObject30);
        }
        CiTest ciTest = this.ciTest;
        if (ciTest != null) {
            JsonObject jsonObject31 = new JsonObject();
            jsonObject31.addProperty("test_execution_id", ciTest.testExecutionId);
            jsonObject.add("ci_test", jsonObject31);
        }
        Os os = this.os;
        if (os != null) {
            JsonObject jsonObject32 = new JsonObject();
            jsonObject32.addProperty(str6, os.name);
            jsonObject32.addProperty(str3, os.version);
            String str37 = os.build;
            if (str37 != null) {
                jsonObject32.addProperty("build", str37);
            }
            jsonObject32.addProperty("version_major", os.versionMajor);
            jsonObject.add("os", jsonObject32);
        }
        Device device = this.device;
        if (device != null) {
            JsonObject jsonObject33 = new JsonObject();
            int i4 = device.f970type;
            if (i4 != 0) {
                JsonPrimitive jsonPrimitive = new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$25(i4));
                str7 = str4;
                jsonObject33.add(str7, jsonPrimitive);
            } else {
                str7 = str4;
            }
            String str38 = device.name;
            if (str38 != null) {
                jsonObject33.addProperty(str6, str38);
            }
            String str39 = device.model;
            if (str39 != null) {
                jsonObject33.addProperty("model", str39);
            }
            String str40 = device.brand;
            if (str40 != null) {
                jsonObject33.addProperty("brand", str40);
            }
            String str41 = device.architecture;
            if (str41 != null) {
                jsonObject33.addProperty("architecture", str41);
            }
            String str42 = device.locale;
            if (str42 != null) {
                jsonObject33.addProperty("locale", str42);
            }
            List list4 = device.locales;
            if (list4 != null) {
                JsonArray jsonArray4 = new JsonArray(list4.size());
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    jsonArray4.add((String) it4.next());
                }
                jsonObject33.add("locales", jsonArray4);
            }
            String str43 = device.timeZone;
            if (str43 != null) {
                jsonObject33.addProperty("time_zone", str43);
            }
            Number number10 = device.batteryLevel;
            if (number10 != null) {
                jsonObject33.addProperty("battery_level", number10);
            }
            Boolean bool28 = device.powerSavingMode;
            if (bool28 != null) {
                jsonObject33.addProperty("power_saving_mode", bool28);
            }
            Number number11 = device.brightnessLevel;
            if (number11 != null) {
                jsonObject33.addProperty("brightness_level", number11);
            }
            jsonObject.add("device", jsonObject33);
        } else {
            str7 = str4;
        }
        JsonObject jsonObject34 = new JsonObject();
        jsonObject34.addProperty("format_version", (Number) 2L);
        Dd dd = this.dd;
        DdSession ddSession = dd.session;
        if (ddSession != null) {
            JsonObject jsonObject35 = new JsonObject();
            Plan plan = ddSession.plan;
            if (plan != null) {
                jsonObject35.add("plan", new JsonPrimitive(plan.jsonValue));
            }
            int i5 = ddSession.sessionPrecondition;
            if (i5 != 0) {
                jsonObject35.add("session_precondition", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$1(i5)));
            }
            jsonObject34.add(str2, jsonObject35);
        }
        Configuration configuration = dd.configuration;
        if (configuration != null) {
            JsonObject jsonObject36 = new JsonObject();
            jsonObject36.addProperty("session_sample_rate", configuration.sessionSampleRate);
            Number number12 = configuration.sessionReplaySampleRate;
            if (number12 != null) {
                jsonObject36.addProperty("session_replay_sample_rate", number12);
            }
            Number number13 = configuration.profilingSampleRate;
            if (number13 != null) {
                jsonObject36.addProperty("profiling_sample_rate", number13);
            }
            Boolean bool29 = configuration.startSessionReplayRecordingManually;
            if (bool29 != null) {
                jsonObject36.addProperty("start_session_replay_recording_manually", bool29);
            }
            jsonObject34.add(BreadcrumbHelper.Category.CONFIGURATION, jsonObject36);
        }
        String str44 = dd.browserSdkVersion;
        if (str44 != null) {
            jsonObject34.addProperty("browser_sdk_version", str44);
        }
        String str45 = dd.sdkName;
        if (str45 != null) {
            jsonObject34.addProperty("sdk_name", str45);
        }
        jsonObject34.addProperty("document_version", Long.valueOf(dd.documentVersion));
        List<PageState> list5 = dd.pageStates;
        if (list5 != null) {
            JsonArray jsonArray5 = new JsonArray(list5.size());
            for (PageState pageState : list5) {
                pageState.getClass();
                JsonObject jsonObject37 = new JsonObject();
                jsonObject37.add("state", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$2(pageState.state)));
                jsonObject37.addProperty(str5, Long.valueOf(pageState.start));
                jsonArray5.add(jsonObject37);
            }
            jsonObject34.add("page_states", jsonArray5);
        }
        ReplayStats replayStats = dd.replayStats;
        if (replayStats != null) {
            JsonObject jsonObject38 = new JsonObject();
            Long l18 = replayStats.recordsCount;
            if (l18 != null) {
                RumErrorSource$EnumUnboxingLocalUtility.m(l18, jsonObject38, "records_count");
            }
            Long l19 = replayStats.segmentsCount;
            if (l19 != null) {
                RumErrorSource$EnumUnboxingLocalUtility.m(l19, jsonObject38, "segments_count");
            }
            Long l20 = replayStats.segmentsTotalRawSize;
            if (l20 != null) {
                RumErrorSource$EnumUnboxingLocalUtility.m(l20, jsonObject38, "segments_total_raw_size");
            }
            jsonObject34.add("replay_stats", jsonObject38);
        }
        DdCls ddCls = dd.cls;
        if (ddCls != null) {
            JsonObject jsonObject39 = new JsonObject();
            Number number14 = ddCls.devicePixelRatio;
            if (number14 != null) {
                jsonObject39.addProperty("device_pixel_ratio", number14);
            }
            jsonObject34.add("cls", jsonObject39);
        }
        Profiling profiling = dd.profiling;
        if (profiling != null) {
            JsonObject jsonObject40 = new JsonObject();
            int i6 = profiling.status;
            if (i6 != 0) {
                jsonObject40.add("status", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$29(i6)));
            }
            int i7 = profiling.errorReason;
            if (i7 != 0) {
                jsonObject40.add("error_reason", new JsonPrimitive(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$27(i7)));
            }
            jsonObject34.add("profiling", jsonObject40);
        }
        jsonObject.add("_dd", jsonObject34);
        Context context = this.context;
        if (context != null) {
            jsonObject.add("context", context.toJson());
        }
        Container container = this.container;
        if (container != null) {
            JsonObject jsonObject41 = new JsonObject();
            ContainerView containerView = container.view;
            JsonObject jsonObject42 = new JsonObject();
            jsonObject42.addProperty("id", containerView.id);
            jsonObject41.add("view", jsonObject42);
            jsonObject41.add(str, new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(container.source)));
            jsonObject.add("container", jsonObject41);
        }
        jsonObject.addProperty(str7, "view");
        Context context2 = this.featureFlags;
        if (context2 != null) {
            jsonObject.add("feature_flags", context2.toJson());
        }
        Privacy privacy = this.privacy;
        if (privacy != null) {
            JsonObject jsonObject43 = new JsonObject();
            jsonObject43.add("replay_level", new JsonPrimitive(ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue(privacy.replayLevel)));
            jsonObject.add("privacy", jsonObject43);
        }
        return jsonObject;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewEvent(date=");
        sb.append(this.date);
        sb.append(", application=");
        sb.append(this.application);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", service=", this.service, ", version=", this.version);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", buildVersion=", this.buildVersion, ", buildId=", this.buildId);
        sb.append(", ddtags=");
        sb.append(this.ddtags);
        sb.append(", session=");
        sb.append(this.session);
        sb.append(", source=");
        sb.append(ViewEvent$State$EnumUnboxingLocalUtility.stringValueOf$4(this.source));
        sb.append(", view=");
        sb.append(this.view);
        sb.append(", usr=");
        sb.append(this.usr);
        sb.append(", account=");
        sb.append(this.account);
        sb.append(", connectivity=");
        sb.append(this.connectivity);
        sb.append(", display=");
        sb.append(this.display);
        sb.append(", synthetics=");
        sb.append(this.synthetics);
        sb.append(", ciTest=");
        sb.append(this.ciTest);
        sb.append(", os=");
        sb.append(this.os);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", dd=");
        sb.append(this.dd);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", container=");
        sb.append(this.container);
        sb.append(", featureFlags=");
        sb.append(this.featureFlags);
        sb.append(", privacy=");
        sb.append(this.privacy);
        sb.append(")");
        return sb.toString();
    }
}
