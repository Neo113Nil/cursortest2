package com.squareup.cash.advertising.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.DefaultMethodSupport;

/* loaded from: classes5.dex */
public abstract class FullscreenAdViewModel {

    public final class Content extends FullscreenAdViewModel {
        public final ArrayList actions;
        public final DefaultMethodSupport asset;
        public final AudioStatus audioStatus;

        public final class ActionViewModel {
            public final String analyticsValue;
            public final Color buttonColor;
            public final CharSequence text;
            public final Color textColor;
            public final String urlToOpen;

            public ActionViewModel(Color color, Color color2, String str, String str2, String str3) {
                str.getClass();
                this.text = str;
                this.urlToOpen = str2;
                this.buttonColor = color;
                this.textColor = color2;
                this.analyticsValue = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionViewModel)) {
                    return false;
                }
                ActionViewModel actionViewModel = (ActionViewModel) obj;
                return Intrinsics.areEqual(this.text, actionViewModel.text) && Intrinsics.areEqual(this.urlToOpen, actionViewModel.urlToOpen) && Intrinsics.areEqual(this.buttonColor, actionViewModel.buttonColor) && Intrinsics.areEqual(this.textColor, actionViewModel.textColor) && this.analyticsValue.equals(actionViewModel.analyticsValue);
            }

            public final int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.urlToOpen;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Color color = this.buttonColor;
                int hashCode3 = (hashCode2 + (color == null ? 0 : color.hashCode())) * 31;
                Color color2 = this.textColor;
                return this.analyticsValue.hashCode() + ((hashCode3 + (color2 != null ? color2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ActionViewModel(text=");
                sb.append((Object) this.text);
                sb.append(", urlToOpen=");
                sb.append(this.urlToOpen);
                sb.append(", buttonColor=");
                sb.append(this.buttonColor);
                sb.append(", textColor=");
                sb.append(this.textColor);
                sb.append(", analyticsValue=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.analyticsValue, ")");
            }
        }

        public final class AudioStatus {
            public static final AudioStatus MUTED_AND_DISABLED = new AudioStatus(true, false);
            public final boolean muted;
            public final boolean showAudioControls;

            public AudioStatus(boolean z, boolean z2) {
                this.muted = z;
                this.showAudioControls = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AudioStatus)) {
                    return false;
                }
                AudioStatus audioStatus = (AudioStatus) obj;
                return this.muted == audioStatus.muted && this.showAudioControls == audioStatus.showAudioControls;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.showAudioControls) + (Boolean.hashCode(this.muted) * 31);
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("AudioStatus(muted=", ", showAudioControls=", ")", this.muted, this.showAudioControls);
            }
        }

        public Content(DefaultMethodSupport defaultMethodSupport, ArrayList arrayList, AudioStatus audioStatus) {
            audioStatus.getClass();
            this.asset = defaultMethodSupport;
            this.actions = arrayList;
            this.audioStatus = audioStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.asset, content.asset) && this.actions.equals(content.actions) && Intrinsics.areEqual(this.audioStatus, content.audioStatus);
        }

        public final int hashCode() {
            DefaultMethodSupport defaultMethodSupport = this.asset;
            return this.audioStatus.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.actions, (defaultMethodSupport == null ? 0 : defaultMethodSupport.hashCode()) * 31, 31);
        }

        public final String toString() {
            return "Content(title=null, subTitle=null, asset=" + this.asset + ", actions=" + this.actions + ", audioStatus=" + this.audioStatus + ")";
        }
    }

    public final class Error extends FullscreenAdViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1264254365;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loading extends FullscreenAdViewModel {
        public final String fallbackImageUrl;

        public Loading(String str) {
            this.fallbackImageUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.fallbackImageUrl, ((Loading) obj).fallbackImageUrl);
        }

        public final int hashCode() {
            String str = this.fallbackImageUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(fallbackImageUrl=", this.fallbackImageUrl, ")");
        }
    }
}
