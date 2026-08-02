package androidx.compose.material3.internal;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class TextFieldImplKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[TextFieldType.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            TextFieldType[] textFieldTypeArr = TextFieldType.$VALUES;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[InputPhase.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            InputPhase inputPhase = InputPhase.Focused;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            InputPhase inputPhase2 = InputPhase.Focused;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
