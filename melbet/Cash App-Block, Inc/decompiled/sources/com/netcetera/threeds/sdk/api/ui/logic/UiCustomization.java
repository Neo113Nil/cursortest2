package com.netcetera.threeds.sdk.api.ui.logic;

import com.netcetera.threeds.sdk.infrastructure.ng;
import com.netcetera.threeds.sdk.infrastructure.no;
import com.netcetera.threeds.sdk.infrastructure.nu;
import com.netcetera.threeds.sdk.infrastructure.oj;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class UiCustomization implements Serializable {
    private static int getSDKInfo = 1;
    private static int getSDKVersion;
    private TextBoxCustomization ThreeDS2Service;
    private ViewCustomization cleanup;
    private LabelCustomization get;
    private ToolbarCustomization initialize;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{UiCustomization.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final Map<String, ButtonCustomization> getWarnings = new HashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ButtonType {
        private static int ThreeDS2ServiceInstance = 0;
        private static int getWarnings = 1;
        public static final ButtonType SUBMIT = new ButtonType("SUBMIT", 0);
        public static final ButtonType CONTINUE = new ButtonType("CONTINUE", 1);
        public static final ButtonType NEXT = new ButtonType("NEXT", 2);
        public static final ButtonType CANCEL = new ButtonType("CANCEL", 3);
        public static final ButtonType RESEND = new ButtonType("RESEND", 4);
        public static final ButtonType OPEN_OOB_APP = new ButtonType("OPEN_OOB_APP", 5);
        public static final ButtonType ADD_CH = new ButtonType("ADD_CH", 6);
        private static final /* synthetic */ ButtonType[] $VALUES = $values();

        private static /* synthetic */ ButtonType[] $values() {
            int i = getWarnings;
            ButtonType[] buttonTypeArr = {SUBMIT, CONTINUE, NEXT, CANCEL, RESEND, OPEN_OOB_APP, ADD_CH};
            ThreeDS2ServiceInstance = (i + 9) % 128;
            return buttonTypeArr;
        }

        static {
            int i = ThreeDS2ServiceInstance + 107;
            getWarnings = i % 128;
            if (i % 2 == 0) {
                int i2 = 4 / 0;
            }
        }

        private ButtonType(String str, int i) {
        }

        public static ButtonType valueOf(String str) {
            ThreeDS2ServiceInstance = (getWarnings + 25) % 128;
            ButtonType buttonType = (ButtonType) Enum.valueOf(ButtonType.class, str);
            getWarnings = (ThreeDS2ServiceInstance + 15) % 128;
            return buttonType;
        }

        public static ButtonType[] values() {
            getWarnings = (ThreeDS2ServiceInstance + 73) % 128;
            ButtonType[] buttonTypeArr = (ButtonType[]) $VALUES.clone();
            getWarnings = (ThreeDS2ServiceInstance + 113) % 128;
            return buttonTypeArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UiCustomizationType {
        private static int ThreeDS2Service = 0;
        private static int get = 1;
        public static final UiCustomizationType DEFAULT = new UiCustomizationType("DEFAULT", 0);
        public static final UiCustomizationType DARK = new UiCustomizationType("DARK", 1);
        public static final UiCustomizationType MONOCHROME = new UiCustomizationType("MONOCHROME", 2);
        private static final /* synthetic */ UiCustomizationType[] $VALUES = $values();

        private static /* synthetic */ UiCustomizationType[] $values() {
            UiCustomizationType[] uiCustomizationTypeArr;
            int i = get;
            int i2 = i + 49;
            ThreeDS2Service = i2 % 128;
            if (i2 % 2 != 0) {
                uiCustomizationTypeArr = new UiCustomizationType[2];
                uiCustomizationTypeArr[1] = DEFAULT;
                uiCustomizationTypeArr[1] = DARK;
                uiCustomizationTypeArr[3] = MONOCHROME;
            } else {
                uiCustomizationTypeArr = new UiCustomizationType[]{DEFAULT, DARK, MONOCHROME};
            }
            ThreeDS2Service = (i + 25) % 128;
            return uiCustomizationTypeArr;
        }

        static {
            int i = get + 7;
            ThreeDS2Service = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private UiCustomizationType(String str, int i) {
        }

        public static UiCustomizationType valueOf(String str) {
            int i = get + 57;
            ThreeDS2Service = i % 128;
            int i2 = i % 2;
            UiCustomizationType uiCustomizationType = (UiCustomizationType) Enum.valueOf(UiCustomizationType.class, str);
            if (i2 != 0) {
                int i3 = 35 / 0;
            }
            return uiCustomizationType;
        }

        public static UiCustomizationType[] values() {
            ThreeDS2Service = (get + 125) % 128;
            UiCustomizationType[] uiCustomizationTypeArr = (UiCustomizationType[]) $VALUES.clone();
            get = (ThreeDS2Service + 87) % 128;
            return uiCustomizationTypeArr;
        }
    }

    public ButtonCustomization getButtonCustomization(ButtonType buttonType) {
        int i = getSDKInfo;
        int i2 = i + 105;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (buttonType != null) {
            return getButtonCustomization(buttonType.name());
        }
        int i3 = i + 81;
        getSDKVersion = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Deprecated
    public boolean getDarkModeSupported() {
        int i = getSDKVersion + 119;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        no noVar = this.ThreeDS2ServiceInstance;
        if (i2 == 0) {
            noVar.initialize("Removed option to opt in to dark mode support for the Netcetera Android 3DS SDK.As a result, this method should no longer be used and will be removed in the next iteration of the SDK");
            return false;
        }
        noVar.initialize("Removed option to opt in to dark mode support for the Netcetera Android 3DS SDK.As a result, this method should no longer be used and will be removed in the next iteration of the SDK");
        return true;
    }

    public LabelCustomization getLabelCustomization() {
        int i = (getSDKVersion + 41) % 128;
        getSDKInfo = i;
        LabelCustomization labelCustomization = this.get;
        int i2 = i + 25;
        getSDKVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return labelCustomization;
        }
        throw null;
    }

    public TextBoxCustomization getTextBoxCustomization() {
        int i = (getSDKVersion + 71) % 128;
        getSDKInfo = i;
        TextBoxCustomization textBoxCustomization = this.ThreeDS2Service;
        getSDKVersion = (i + 97) % 128;
        return textBoxCustomization;
    }

    public ToolbarCustomization getToolbarCustomization() {
        int i = getSDKInfo + 109;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        ToolbarCustomization toolbarCustomization = this.initialize;
        if (i2 == 0) {
            return toolbarCustomization;
        }
        throw null;
    }

    public ViewCustomization getViewCustomization() {
        int i = getSDKVersion + 5;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        ViewCustomization viewCustomization = this.cleanup;
        if (i2 == 0) {
            int i3 = 44 / 0;
        }
        return viewCustomization;
    }

    public void setButtonCustomization(ButtonCustomization buttonCustomization, ButtonType buttonType) {
        int i = getSDKVersion + 103;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            ng.ThreeDS2Service(buttonCustomization, "buttonCustomization ");
            ng.ThreeDS2Service(buttonType, "buttonType");
            setButtonCustomization(buttonCustomization, buttonType.name());
            throw null;
        }
        ng.ThreeDS2Service(buttonCustomization, "buttonCustomization ");
        ng.ThreeDS2Service(buttonType, "buttonType");
        setButtonCustomization(buttonCustomization, buttonType.name());
        int i2 = getSDKInfo + 11;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void setLabelCustomization(LabelCustomization labelCustomization) {
        int i = getSDKInfo + 51;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            ng.ThreeDS2Service(labelCustomization, "labelCustomization");
            this.get = labelCustomization;
        } else {
            ng.ThreeDS2Service(labelCustomization, "labelCustomization");
            this.get = labelCustomization;
            throw null;
        }
    }

    public void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        int i = getSDKInfo + 67;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            ng.ThreeDS2Service(textBoxCustomization, "textBoxCustomization ");
            this.ThreeDS2Service = textBoxCustomization;
        } else {
            ng.ThreeDS2Service(textBoxCustomization, "textBoxCustomization ");
            this.ThreeDS2Service = textBoxCustomization;
            throw null;
        }
    }

    public void setToolbarCustomization(ToolbarCustomization toolbarCustomization) {
        getSDKInfo = (getSDKVersion + 33) % 128;
        ng.ThreeDS2Service(toolbarCustomization, "toolbarCustomization");
        this.initialize = toolbarCustomization;
        int i = getSDKVersion + 39;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public void setViewCustomization(ViewCustomization viewCustomization) {
        int i = getSDKInfo + 83;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            ng.ThreeDS2Service(viewCustomization, "viewCustomization");
            this.cleanup = viewCustomization;
            int i2 = 73 / 0;
        } else {
            ng.ThreeDS2Service(viewCustomization, "viewCustomization");
            this.cleanup = viewCustomization;
        }
        getSDKVersion = (getSDKInfo + 73) % 128;
    }

    @Deprecated
    public void supportDarkMode(boolean z) {
        int i = getSDKVersion + 91;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        no noVar = this.ThreeDS2ServiceInstance;
        if (i2 != 0) {
            noVar.initialize("Removed option to opt in to dark mode support for the Netcetera Android 3DS SDK.As a result, this method should no longer be used and will be removed in the next iteration of the SDK");
        } else {
            noVar.initialize("Removed option to opt in to dark mode support for the Netcetera Android 3DS SDK.As a result, this method should no longer be used and will be removed in the next iteration of the SDK");
            throw null;
        }
    }

    public ButtonCustomization getButtonCustomization(String str) {
        int i = getSDKVersion + 87;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        ButtonCustomization buttonCustomization = this.getWarnings.get(oj.getWarnings(str));
        if (i2 != 0) {
            return buttonCustomization;
        }
        throw null;
    }

    public void setButtonCustomization(ButtonCustomization buttonCustomization, String str) {
        getSDKInfo = (getSDKVersion + 97) % 128;
        ng.ThreeDS2Service(buttonCustomization, "buttonCustomization");
        ng.get(str, "customButtonType");
        this.getWarnings.put(oj.getWarnings(str), buttonCustomization);
        int i = getSDKVersion + 57;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
