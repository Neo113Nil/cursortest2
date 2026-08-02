package com.squareup.cash.phoneplans;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PhonePlansHomeViewModel {

    public final class Content implements PhonePlansHomeViewModel {
        public final Header header;
        public final Pair infoCards;
        public final ArrayList links;

        public interface Header {

            public final class Active implements Header {
                public final CtaStyle ctaStyle;
                public final String ctaText;
                public final String title;

                public Active(String str, String str2, CtaStyle ctaStyle) {
                    this.title = str;
                    this.ctaText = str2;
                    this.ctaStyle = ctaStyle;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Active)) {
                        return false;
                    }
                    Active active = (Active) obj;
                    return this.title.equals(active.title) && Intrinsics.areEqual(this.ctaText, active.ctaText) && this.ctaStyle == active.ctaStyle;
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.ctaText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    CtaStyle ctaStyle = this.ctaStyle;
                    return hashCode2 + (ctaStyle != null ? ctaStyle.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Active(title=", this.title, ", ctaText=", this.ctaText, ", ctaStyle=");
                    m.append(this.ctaStyle);
                    m.append(")");
                    return m.toString();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class CtaStyle {
                public static final /* synthetic */ CtaStyle[] $VALUES;
                public static final CtaStyle Button;
                public static final CtaStyle Link;

                static {
                    CtaStyle ctaStyle = new CtaStyle("Link", 0);
                    Link = ctaStyle;
                    CtaStyle ctaStyle2 = new CtaStyle("Button", 1);
                    Button = ctaStyle2;
                    $VALUES = new CtaStyle[]{ctaStyle, ctaStyle2};
                }

                public static CtaStyle valueOf(String str) {
                    return (CtaStyle) Enum.valueOf(CtaStyle.class, str);
                }

                public static CtaStyle[] values() {
                    return (CtaStyle[]) $VALUES.clone();
                }
            }

            public final class Inactive implements Header {
                public final String body;
                public final String ctaText;
                public final String title;

                public Inactive(String str, String str2, String str3) {
                    this.title = str;
                    this.body = str2;
                    this.ctaText = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Inactive)) {
                        return false;
                    }
                    Inactive inactive = (Inactive) obj;
                    return this.title.equals(inactive.title) && this.body.equals(inactive.body) && Intrinsics.areEqual(this.ctaText, inactive.ctaText);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
                    String str = this.ctaText;
                    return m + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Inactive(title=", this.title, ", body=", this.body, ", ctaText="), this.ctaText, ")");
                }
            }
        }

        public final class InfoCard {
            public final String caption;
            public final String content;
            public final String label;
            public final Progress progress;

            public final class Progress {
                public final Color color;
                public final float percentage;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class Color {
                    public static final /* synthetic */ Color[] $VALUES;
                    public static final Color Green;
                    public static final Color Orange;

                    static {
                        Color color = new Color("Green", 0);
                        Green = color;
                        Color color2 = new Color("Orange", 1);
                        Orange = color2;
                        $VALUES = new Color[]{color, color2};
                    }

                    public static Color valueOf(String str) {
                        return (Color) Enum.valueOf(Color.class, str);
                    }

                    public static Color[] values() {
                        return (Color[]) $VALUES.clone();
                    }
                }

                public Progress(float f, Color color) {
                    this.percentage = f;
                    this.color = color;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Progress)) {
                        return false;
                    }
                    Progress progress = (Progress) obj;
                    return Float.compare(this.percentage, progress.percentage) == 0 && this.color == progress.color;
                }

                public final int hashCode() {
                    return this.color.hashCode() + (Float.hashCode(this.percentage) * 31);
                }

                public final String toString() {
                    return "Progress(percentage=" + this.percentage + ", color=" + this.color + ")";
                }
            }

            public InfoCard(String str, String str2, String str3, Progress progress) {
                this.label = str;
                this.content = str2;
                this.caption = str3;
                this.progress = progress;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InfoCard)) {
                    return false;
                }
                InfoCard infoCard = (InfoCard) obj;
                return this.label.equals(infoCard.label) && this.content.equals(infoCard.content) && Intrinsics.areEqual(this.caption, infoCard.caption) && Intrinsics.areEqual(this.progress, infoCard.progress);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.content);
                String str = this.caption;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                Progress progress = this.progress;
                return hashCode + (progress != null ? progress.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InfoCard(label=", this.label, ", content=", this.content, ", caption=");
                m.append(this.caption);
                m.append(", progress=");
                m.append(this.progress);
                m.append(")");
                return m.toString();
            }
        }

        public final class Link {
            public final String iconId;
            public final String label;

            public Link(String str, String str2) {
                this.iconId = str;
                this.label = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Link)) {
                    return false;
                }
                Link link = (Link) obj;
                return this.iconId.equals(link.iconId) && this.label.equals(link.label);
            }

            public final int hashCode() {
                return this.label.hashCode() + (this.iconId.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Link(iconId=", this.iconId, ", label=", this.label, ")");
            }
        }

        public Content(Header header, Pair pair, ArrayList arrayList) {
            this.header = header;
            this.infoCards = pair;
            this.links = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.header.equals(content.header) && Intrinsics.areEqual(this.infoCards, content.infoCards) && this.links.equals(content.links);
        }

        public final int hashCode() {
            int hashCode = this.header.hashCode() * 31;
            Pair pair = this.infoCards;
            return this.links.hashCode() + ((hashCode + (pair == null ? 0 : pair.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(header=");
            sb.append(this.header);
            sb.append(", infoCards=");
            sb.append(this.infoCards);
            sb.append(", links=");
            return Recorder$$ExternalSyntheticOutline1.m(")", sb, this.links);
        }
    }

    public final class Error implements PhonePlansHomeViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -855555965;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loading implements PhonePlansHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -34890505;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
