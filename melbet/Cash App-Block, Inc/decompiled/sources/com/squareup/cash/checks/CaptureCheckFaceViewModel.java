package com.squareup.cash.checks;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.miteksystems.misnap.core.MiSnapSettings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes6.dex */
public interface CaptureCheckFaceViewModel {

    public final class CameraPermissionPermanentlyDenied implements CaptureCheckFaceViewModel {
        public static final CameraPermissionPermanentlyDenied INSTANCE = new CameraPermissionPermanentlyDenied();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CameraPermissionPermanentlyDenied);
        }

        public final int hashCode() {
            return 225044520;
        }

        public final String toString() {
            return "CameraPermissionPermanentlyDenied";
        }
    }

    public interface Loaded extends CaptureCheckFaceViewModel {

        public final class FinalFrame implements Loaded {
            public final List fourCorners;
            public final ByteString frame;
            public final int miSnapViewHeight;
            public final int miSnapViewWidth;
            public final Orientation orientation;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Orientation {
                public static final /* synthetic */ Orientation[] $VALUES;
                public static final Orientation LANDSCAPE;
                public static final Orientation PORTRAIT;

                static {
                    Orientation orientation = new Orientation("PORTRAIT", 0);
                    PORTRAIT = orientation;
                    Orientation orientation2 = new Orientation("LANDSCAPE", 1);
                    LANDSCAPE = orientation2;
                    $VALUES = new Orientation[]{orientation, orientation2};
                }

                public static Orientation valueOf(String str) {
                    return (Orientation) Enum.valueOf(Orientation.class, str);
                }

                public static Orientation[] values() {
                    return (Orientation[]) $VALUES.clone();
                }
            }

            public final class Point {
                public final int x;
                public final int y;

                public Point(int i, int i2) {
                    this.x = i;
                    this.y = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Point)) {
                        return false;
                    }
                    Point point = (Point) obj;
                    return this.x == point.x && this.y == point.y;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.y) + (Integer.hashCode(this.x) * 31);
                }

                public final String toString() {
                    return Recorder$$ExternalSyntheticOutline2.m(this.x, this.y, "Point(x=", ", y=", ")");
                }
            }

            public FinalFrame(ByteString byteString, List list, Orientation orientation, int i, int i2) {
                this.frame = byteString;
                this.fourCorners = list;
                this.orientation = orientation;
                this.miSnapViewWidth = i;
                this.miSnapViewHeight = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FinalFrame)) {
                    return false;
                }
                FinalFrame finalFrame = (FinalFrame) obj;
                return this.frame.equals(finalFrame.frame) && Intrinsics.areEqual(this.fourCorners, finalFrame.fourCorners) && this.orientation == finalFrame.orientation && this.miSnapViewWidth == finalFrame.miSnapViewWidth && this.miSnapViewHeight == finalFrame.miSnapViewHeight;
            }

            public final int hashCode() {
                int hashCode = this.frame.hashCode() * 31;
                List list = this.fourCorners;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                Orientation orientation = this.orientation;
                return Integer.hashCode(this.miSnapViewHeight) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.miSnapViewWidth, (hashCode2 + (orientation != null ? orientation.hashCode() : 0)) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FinalFrame(frame=");
                sb.append(this.frame);
                sb.append(", fourCorners=");
                sb.append(this.fourCorners);
                sb.append(", orientation=");
                sb.append(this.orientation);
                sb.append(", miSnapViewWidth=");
                sb.append(this.miSnapViewWidth);
                sb.append(", miSnapViewHeight=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.miSnapViewHeight, ")", sb);
            }
        }

        public final class ShowMiSnap implements Loaded {
            public final String hint;
            public final String miSnapLicense;
            public final MiSnapSettings.UseCase miSnapUseCase;
            public final boolean showCameraShutterButton;

            public ShowMiSnap(String str, MiSnapSettings.UseCase useCase, boolean z, String str2) {
                str.getClass();
                useCase.getClass();
                this.miSnapLicense = str;
                this.miSnapUseCase = useCase;
                this.showCameraShutterButton = z;
                this.hint = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowMiSnap)) {
                    return false;
                }
                ShowMiSnap showMiSnap = (ShowMiSnap) obj;
                return Intrinsics.areEqual(this.miSnapLicense, showMiSnap.miSnapLicense) && this.miSnapUseCase == showMiSnap.miSnapUseCase && this.showCameraShutterButton == showMiSnap.showCameraShutterButton && Intrinsics.areEqual(this.hint, showMiSnap.hint);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.miSnapUseCase.hashCode() + (this.miSnapLicense.hashCode() * 31)) * 31, 31, this.showCameraShutterButton);
                String str = this.hint;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "ShowMiSnap(miSnapLicense=" + this.miSnapLicense + ", miSnapUseCase=" + this.miSnapUseCase + ", showCameraShutterButton=" + this.showCameraShutterButton + ", hint=" + this.hint + ")";
            }
        }
    }

    public final class Loading implements CaptureCheckFaceViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -610691294;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
