package defpackage;

import skeletor.parser.util.StackMode;

/* loaded from: classes10.dex */
public final class wyt0 {
    public static StackMode a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3170) {
                if (hashCode != 3241) {
                    if (hashCode != 3681) {
                        if (hashCode != 3662) {
                            if (hashCode == 3663 && str.equals("sb")) {
                                return StackMode.SpaceBetween;
                            }
                        } else if (str.equals("sa")) {
                            return StackMode.SpaceAround;
                        }
                    } else if (str.equals("st")) {
                        return StackMode.Start;
                    }
                } else if (str.equals("en")) {
                    return StackMode.End;
                }
            } else if (str.equals("ce")) {
                return StackMode.Center;
            }
        }
        return StackMode.Start;
    }
}
