package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaStructure {
    public static final WinterFlowJavaStructure WinterFlowResponseEngine;
    public static final WinterFlowJavaStructure WinterFlowRouterRouter;
    public static final WinterFlowJavaStructure WinterFlowServerProtocol;
    public static final /* synthetic */ WinterFlowJavaStructure[] WinterFlowServiceUtility;
    public static final WinterFlowJavaStructure WinterFlowSyntax;
    public static final WinterFlowJavaStructure WinterFlowThreadListener;
    public static final WinterFlowJavaStructure WinterFlowTransactionAgent;
    public static final WinterFlowJavaStructure WinterFlowTransactionManagerStrategy;
    public static final WinterFlowJavaStructure WinterFlowUnitTestResponse;
    public static final WinterFlowJavaStructure WinterFlowVariableVersionControl;

    static {
        WinterFlowJavaStructure winterFlowJavaStructure = new WinterFlowJavaStructure("INT", 0);
        WinterFlowVariableVersionControl = winterFlowJavaStructure;
        WinterFlowJavaStructure winterFlowJavaStructure2 = new WinterFlowJavaStructure("LONG", 1);
        WinterFlowTransactionManagerStrategy = winterFlowJavaStructure2;
        WinterFlowJavaStructure winterFlowJavaStructure3 = new WinterFlowJavaStructure("FLOAT", 2);
        WinterFlowUnitTestResponse = winterFlowJavaStructure3;
        WinterFlowJavaStructure winterFlowJavaStructure4 = new WinterFlowJavaStructure("DOUBLE", 3);
        WinterFlowRouterRouter = winterFlowJavaStructure4;
        WinterFlowJavaStructure winterFlowJavaStructure5 = new WinterFlowJavaStructure("BOOLEAN", 4);
        WinterFlowSyntax = winterFlowJavaStructure5;
        WinterFlowJavaStructure winterFlowJavaStructure6 = new WinterFlowJavaStructure("STRING", 5);
        WinterFlowResponseEngine = winterFlowJavaStructure6;
        WinterFlowMicroserviceCloud winterFlowMicroserviceCloud = WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse;
        WinterFlowJavaStructure winterFlowJavaStructure7 = new WinterFlowJavaStructure("BYTE_STRING", 6);
        WinterFlowTransactionAgent = winterFlowJavaStructure7;
        WinterFlowJavaStructure winterFlowJavaStructure8 = new WinterFlowJavaStructure("ENUM", 7);
        WinterFlowServerProtocol = winterFlowJavaStructure8;
        WinterFlowJavaStructure winterFlowJavaStructure9 = new WinterFlowJavaStructure("MESSAGE", 8);
        WinterFlowThreadListener = winterFlowJavaStructure9;
        WinterFlowServiceUtility = new WinterFlowJavaStructure[]{winterFlowJavaStructure, winterFlowJavaStructure2, winterFlowJavaStructure3, winterFlowJavaStructure4, winterFlowJavaStructure5, winterFlowJavaStructure6, winterFlowJavaStructure7, winterFlowJavaStructure8, winterFlowJavaStructure9};
    }

    public static WinterFlowJavaStructure valueOf(String str) {
        return (WinterFlowJavaStructure) Enum.valueOf(WinterFlowJavaStructure.class, str);
    }

    public static WinterFlowJavaStructure[] values() {
        return (WinterFlowJavaStructure[]) WinterFlowServiceUtility.clone();
    }
}
