package androidx.activity;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.versionedparcelable.ArcticByteModuleSyntaxK9b7A5f5fcCBc60KKj74442121357334;
import androidx.versionedparcelable.ArcticByteMonitorGenericXMJz88hiFychySEvEg26823359626937;
import androidx.versionedparcelable.AxiomCoreBuilderTemplatingKfFzeHxQCDnjFwwdRI37122828707307;
import androidx.versionedparcelable.AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568;
import androidx.versionedparcelable.BlazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220;
import androidx.versionedparcelable.BlazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490;
import androidx.versionedparcelable.BlazePulseImmutableVariableTwKja7s4jHv2LKNggW44756713336498;
import androidx.versionedparcelable.BlazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704;
import androidx.versionedparcelable.BlueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552;
import androidx.versionedparcelable.BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859;
import androidx.versionedparcelable.CosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143;
import androidx.versionedparcelable.DeltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034;
import androidx.versionedparcelable.DeltaSignalStateDispatcherWPPKA8d86fC2ifemfZ11609986421791;
import androidx.versionedparcelable.DragonRouteDecryptionBitwiseOkzqkovAfxw9kFgQuX99525885297219;
import androidx.versionedparcelable.FrostBridgeRouterFilterIdewQDOHnExmfRYv6c95551798604894;
import androidx.versionedparcelable.GoldenVectorBinaryOperatorB6C2SkXn1ZjlUzoopV69053203471163;
import androidx.versionedparcelable.GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246;
import androidx.versionedparcelable.HeliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556;
import androidx.versionedparcelable.HeliosRuntimeModuleJITWmgqCR8YDgEmJ6ANjr24138469502700;
import androidx.versionedparcelable.IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990;
import androidx.versionedparcelable.IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406;
import androidx.versionedparcelable.IronMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685;
import androidx.versionedparcelable.JadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647;
import androidx.versionedparcelable.JadeCircuitLibraryAPIMxhqGereu8zjFriFcM27648280204037;
import androidx.versionedparcelable.LunarNodeAdapterValidationTbyFSjPkKjA81AR27230405400088733;
import androidx.versionedparcelable.MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942;
import androidx.versionedparcelable.ObsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845;
import androidx.versionedparcelable.ObsidianEngineReflectionFilterHCpVP8mmJFQx1c08l360349909413005;
import androidx.versionedparcelable.ObsidianEngineStreamBuilderAU3aKXZN1UACOALptY43814717748976;
import androidx.versionedparcelable.ObsidianEngineVectorStreamMdwnkTX0BC4QJnM0C984284538751478;
import androidx.versionedparcelable.PhotonFrameJITObjectVAOTD4Ic6G6kjUzZnS34751108591762;
import androidx.versionedparcelable.QuantumStreamConstructorEncryptionLFbO3pLDZY06nkTHXT21787397241646;
import androidx.versionedparcelable.RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050;
import androidx.versionedparcelable.SolarMeshDecoderNamespaceHAQKgoUNXbh5HbEA1w44150968935866;
import androidx.versionedparcelable.SolarMeshFactoryMacroJTLBntAPlYmkFjHttm77382696346875;
import androidx.versionedparcelable.SolarMeshLambdaPipelineKYuK1XLhyrHmKp1rl545830849680950;
import androidx.versionedparcelable.SolarMeshManagerBinaryTreeI2CIvbMBPxS9bJWKdv79052527547104;
import androidx.versionedparcelable.SolarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766;
import androidx.versionedparcelable.UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250;
import androidx.versionedparcelable.VertexLinkPostfixValidationKXKdwcpGSOtkIj1h0p51424624091622;
import androidx.versionedparcelable.VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997;
import androidx.versionedparcelable.WhiteFieldTransportSchedulerCi0Vr18lrM2PKHC8Cb97533289990028;
import androidx.versionedparcelable.XenoGridContainerInterfaceEXBrUH5vvePDsijYi961878805527573;
import androidx.versionedparcelable.XenoGridProviderCryptographyM0EHxSxOzrfWz2EEdQ39231868148600;
import androidx.versionedparcelable.YellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575;
import androidx.versionedparcelable.YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214;
import androidx.versionedparcelable.ZenithPathEncryptionPolymorphismHMxtIV1kvN80Zp8zK696772031032441;
import androidx.versionedparcelable.ZenithPathManagerSyntaxKVVqp1N8pUnsjLDSKz55973249426103;
import androidx.versionedparcelable.ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305;
import androidx.versionedparcelable.ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215;
import com.icecatchpuzzle.puzzleicecatch.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements CosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143, VertexLinkPostfixValidationKXKdwcpGSOtkIj1h0p51424624091622, YellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575, PhotonFrameJITObjectVAOTD4Ic6G6kjUzZnS34751108591762, ObsidianEngineReflectionFilterHCpVP8mmJFQx1c08l360349909413005 {
    public static final /* synthetic */ int CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983 = 0;
    public BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final CopyOnWriteArrayList CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927;
    public final CopyOnWriteArrayList CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
    public final CopyOnWriteArrayList EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
    public final DeltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final WhiteFieldTransportSchedulerCi0Vr18lrM2PKHC8Cb97533289990028 NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public final AtomicInteger ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
    public final CopyOnWriteArrayList ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
    public final CopyOnWriteArrayList PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036;
    public final WhiteFieldTransportSchedulerCi0Vr18lrM2PKHC8Cb97533289990028 PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942;
    public boolean RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598;
    public final CopyOnWriteArrayList SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571;
    public final RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final WhiteFieldTransportSchedulerCi0Vr18lrM2PKHC8Cb97533289990028 UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541;
    public final BlueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552 UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public boolean XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195;
    public final IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public final SolarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;

    public ComponentActivity() {
        DeltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034 deltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034 = new DeltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034();
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = deltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034;
        int i = 1;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406(new XenoGridContainerInterfaceEXBrUH5vvePDsijYi961878805527573(this, 1));
        BlazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220 blazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220 = new BlazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220(this, new ZenithPathEncryptionPolymorphismHMxtIV1kvN80Zp8zK696772031032441(17, this));
        RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 rapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 = new RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050(blazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220, 3);
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = rapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050;
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = new BlueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552(this);
        this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = new WhiteFieldTransportSchedulerCi0Vr18lrM2PKHC8Cb97533289990028(new JadeCircuitLibraryAPIMxhqGereu8zjFriFcM27648280204037(this, 1));
        this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = new AtomicInteger();
        this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = new SolarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766(this);
        this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = new CopyOnWriteArrayList();
        this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = new CopyOnWriteArrayList();
        this.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = new CopyOnWriteArrayList();
        this.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036 = new CopyOnWriteArrayList();
        this.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 = new CopyOnWriteArrayList();
        this.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = new CopyOnWriteArrayList();
        this.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 = new WhiteFieldTransportSchedulerCi0Vr18lrM2PKHC8Cb97533289990028(new JadeCircuitLibraryAPIMxhqGereu8zjFriFcM27648280204037(this, 2));
        UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 == null) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        int i2 = 0;
        ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new LunarNodeAdapterValidationTbyFSjPkKjA81AR27230405400088733(i2, this));
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new LunarNodeAdapterValidationTbyFSjPkKjA81AR27230405400088733(i, this));
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new BlazePulseImmutableVariableTwKja7s4jHv2LKNggW44756713336498(i, this));
        blazePulseBinaryPrefixY6Psil4Q5hAkpHcrIU18188086073220.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(this);
        ((RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050) rapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170("android:support:activity-result", new ZenithPathManagerSyntaxKVVqp1N8pUnsjLDSKz55973249426103(i2, this));
        ObsidianEngineStreamBuilderAU3aKXZN1UACOALptY43814717748976 obsidianEngineStreamBuilderAU3aKXZN1UACOALptY43814717748976 = new ObsidianEngineStreamBuilderAU3aKXZN1UACOALptY43814717748976(this);
        ComponentActivity componentActivity = deltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (componentActivity != null) {
            obsidianEngineStreamBuilderAU3aKXZN1UACOALptY43814717748976.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(componentActivity);
        }
        deltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.add(obsidianEngineStreamBuilderAU3aKXZN1UACOALptY43814717748976);
        new WhiteFieldTransportSchedulerCi0Vr18lrM2PKHC8Cb97533289990028(new JadeCircuitLibraryAPIMxhqGereu8zjFriFcM27648280204037(this, 3));
        this.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942 = new WhiteFieldTransportSchedulerCi0Vr18lrM2PKHC8Cb97533289990028(new JadeCircuitLibraryAPIMxhqGereu8zjFriFcM27648280204037(this, 4));
    }

    public static void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // androidx.versionedparcelable.ObsidianEngineReflectionFilterHCpVP8mmJFQx1c08l360349909413005
    public final VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    }

    @Override // androidx.versionedparcelable.YellowLoopModuleMacroOZDwPDkVNBtR3KyIUT22705939182575
    public final RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        return (RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050) this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }

    public final void BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.versionedparcelable.CosmicForgeNamespaceWildcardMGn8XzKX4BjjCWAIoY81278564078143
    public final BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119() {
        if (getApplication() == null) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 == null) {
            BlazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490 blazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490 = (BlazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490) getLastNonConfigurationInstance();
            if (blazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490 != null) {
                this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = blazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            }
            if (this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 == null) {
                this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = new BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859(1);
            }
        }
        BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859.getClass();
        return blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859;
    }

    @Override // androidx.versionedparcelable.PhotonFrameJITObjectVAOTD4Ic6G6kjUzZnS34751108591762
    public final SolarMeshManagerBinaryTreeI2CIvbMBPxS9bJWKdv79052527547104 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        return (SolarMeshManagerBinaryTreeI2CIvbMBPxS9bJWKdv79052527547104) this.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942.getValue();
    }

    @Override // androidx.versionedparcelable.VertexLinkPostfixValidationKXKdwcpGSOtkIj1h0p51424624091622
    public final SolarMeshFactoryMacroJTLBntAPlYmkFjHttm77382696346875 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() {
        QuantumStreamConstructorEncryptionLFbO3pLDZY06nkTHXT21787397241646 quantumStreamConstructorEncryptionLFbO3pLDZY06nkTHXT21787397241646 = new QuantumStreamConstructorEncryptionLFbO3pLDZY06nkTHXT21787397241646(SolarMeshLambdaPipelineKYuK1XLhyrHmKp1rl545830849680950.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = quantumStreamConstructorEncryptionLFbO3pLDZY06nkTHXT21787397241646.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (application != null) {
            linkedHashMap.put(HeliosRuntimeModuleJITWmgqCR8YDgEmJ6ANjr24138469502700.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, getApplication());
        }
        linkedHashMap.put(YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, this);
        linkedHashMap.put(YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, extras);
        }
        return quantumStreamConstructorEncryptionLFbO3pLDZY06nkTHXT21787397241646;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.versionedparcelable.DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014
    public final UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    }

    public final ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215 UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(final HeliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556 heliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556, final AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568 axiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568) {
        final SolarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766 solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766 = this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
        solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.getClass();
        final String str = "activity_rq#" + this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.getAndIncrement();
        LinkedHashMap linkedHashMap = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.compareTo(BlazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            BlazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704 blazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704 = ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            sb.append(" is attempting to register while current state is ");
            sb.append(blazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        LinkedHashMap linkedHashMap2 = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        LinkedHashMap linkedHashMap3 = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int i = 1;
        if (((Integer) linkedHashMap3.get(str)) == null) {
            FrostBridgeRouterFilterIdewQDOHnExmfRYv6c95551798604894 frostBridgeRouterFilterIdewQDOHnExmfRYv6c95551798604894 = new FrostBridgeRouterFilterIdewQDOHnExmfRYv6c95551798604894(0);
            Iterator it = new DragonRouteDecryptionBitwiseOkzqkovAfxw9kFgQuX99525885297219(new ArcticByteMonitorGenericXMJz88hiFychySEvEg26823359626937(frostBridgeRouterFilterIdewQDOHnExmfRYv6c95551798604894, new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(26, frostBridgeRouterFilterIdewQDOHnExmfRYv6c95551798604894), i)).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                if (!linkedHashMap2.containsKey(Integer.valueOf(number.intValue()))) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap3.put(str, Integer.valueOf(intValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        IronMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685 ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685 = (IronMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685) linkedHashMap.get(str);
        if (ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685 == null) {
            ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685 = new IronMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685(ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250);
        }
        ObsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845 obsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845 = new ObsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845() { // from class: androidx.versionedparcelable.DragonRouteTranspilerDelegateH06k0cvNCO94PlqKjo74950010423775
            @Override // androidx.versionedparcelable.ObsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845
            public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(DeltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014 deltaSignalAbstractionDecoderL8YZ8FPiOBh30NoZVz36821379779014, NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073) {
                Integer num;
                NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073 novaLayerStateAnnotationXKDio9YaHeDJRrC7C0941349726720732 = NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_START;
                SolarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766 solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662 = SolarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766.this;
                String str2 = str;
                if (novaLayerStateAnnotationXKDio9YaHeDJRrC7C0941349726720732 == novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073) {
                    LinkedHashMap linkedHashMap4 = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                    Bundle bundle = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                    LinkedHashMap linkedHashMap5 = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                    HeliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556 heliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ496327751685562 = heliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ49632775168556;
                    AxiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568 axiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP230627143665682 = axiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568;
                    linkedHashMap4.put(str2, new WhiteFieldAbstractionBinaryJmJOe4JekH710S1s1H10463719111752(heliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ496327751685562, axiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP230627143665682));
                    if (linkedHashMap5.containsKey(str2)) {
                        Object obj = linkedHashMap5.get(str2);
                        linkedHashMap5.remove(str2);
                        heliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ496327751685562.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(obj);
                    }
                    XenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113 xenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113 = (XenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113) ArcticByteProcessorCompressionLMUCZsNpuPxKIs0RXh87323342817578.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(str2, bundle);
                    if (xenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113 != null) {
                        bundle.remove(str2);
                        heliosRuntimeAbstractionTemplatingWrwoI0hZ6iTVRnm5jZ496327751685562.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(axiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP230627143665682.CrimsonRouteContainerEncryptionBYDjKqEkgoJPSxosOH53474174893070(xenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, xenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867));
                        return;
                    }
                    return;
                }
                if (NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_STOP == novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073) {
                    solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.remove(str2);
                    return;
                }
                if (NovaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073.ON_DESTROY == novaLayerStateAnnotationXKDio9YaHeDJRrC7C094134972672073) {
                    LinkedHashMap linkedHashMap6 = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                    Bundle bundle2 = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                    LinkedHashMap linkedHashMap7 = solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                    if (!solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.contains(str2) && (num = (Integer) solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.remove(str2)) != null) {
                        solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.remove(num);
                    }
                    solarMeshPacketEncoderIJbWQSlPGWchLDpLKN492348434087662.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.remove(str2);
                    if (linkedHashMap7.containsKey(str2)) {
                        Objects.toString(linkedHashMap7.get(str2));
                        linkedHashMap7.remove(str2);
                    }
                    if (bundle2.containsKey(str2)) {
                        Objects.toString((XenoGridArrayForeachOAA0GjzgVpcW1IY6pS35314307148113) ArcticByteProcessorCompressionLMUCZsNpuPxKIs0RXh87323342817578.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(str2, bundle2));
                        bundle2.remove(str2);
                    }
                    IronMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685 ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc172460065176852 = (IronMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685) linkedHashMap6.get(str2);
                    if (ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc172460065176852 != null) {
                        ArrayList arrayList = ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc172460065176852.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc172460065176852.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170((ObsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845) obj2);
                        }
                        arrayList.clear();
                        linkedHashMap6.remove(str2);
                    }
                }
            }
        };
        ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(obsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845);
        ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.add(obsidianEnginePacketHashmapV1H0zIMkv2CgfQneqP65795279991845);
        linkedHashMap.put(str, ironMatrixProtocolMultithreadingETpej5Isu7bo9d1xlc17246006517685);
        return new ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215(solarMeshPacketEncoderIJbWQSlPGWchLDpLKN49234843408766, str, axiomCoreSchedulerSerializationDsZBnm4orErCHS3JLP23062714366568, i);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((AxiomCoreBuilderTemplatingKfFzeHxQCDnjFwwdRI37122828707307) this.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541.getValue()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ArcticByteModuleSyntaxK9b7A5f5fcCBc60KKj74442121357334) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(bundle);
        DeltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034 deltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        deltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034.getClass();
        deltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = this;
        Iterator it = deltaSignalComponentSchedulerK6nC7B8e5FfZ4TvPPf87024117901034.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.iterator();
        while (it.hasNext()) {
            ((ObsidianEngineStreamBuilderAU3aKXZN1UACOALptY43814717748976) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(this);
        }
        super.onCreate(bundle);
        int i = XenoGridProviderCryptographyM0EHxSxOzrfWz2EEdQ39231868148600.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        DeltaSignalStateDispatcherWPPKA8d86fC2ifemfZ11609986421791.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((SolarMeshDecoderNamespaceHAQKgoUNXbh5HbEA1w44150968935866) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((SolarMeshDecoderNamespaceHAQKgoUNXbh5HbEA1w44150968935866) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 = false;
            Iterator it = this.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((ArcticByteModuleSyntaxK9b7A5f5fcCBc60KKj74442121357334) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new GoldenVectorBinaryOperatorB6C2SkXn1ZjlUzoopV69053203471163(z));
            }
        } catch (Throwable th) {
            this.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ArcticByteModuleSyntaxK9b7A5f5fcCBc60KKj74442121357334) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).iterator();
        if (it.hasNext()) {
            ((SolarMeshDecoderNamespaceHAQKgoUNXbh5HbEA1w44150968935866) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195 = false;
            Iterator it = this.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((ArcticByteModuleSyntaxK9b7A5f5fcCBc60KKj74442121357334) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new ObsidianEngineVectorStreamMdwnkTX0BC4QJnM0C984284538751478(z));
            }
        } catch (Throwable th) {
            this.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195 = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((SolarMeshDecoderNamespaceHAQKgoUNXbh5HbEA1w44150968935866) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        BlazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490 blazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490;
        BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 == null && (blazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490 = (BlazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490) getLastNonConfigurationInstance()) != null) {
            blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 = blazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        }
        if (blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859 == null) {
            return null;
        }
        BlazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490 blazePulseCacheParserE5J9MIXejCUzYpvDP1920396448114902 = new BlazePulseCacheParserE5J9MIXejCUzYpvDP192039644811490();
        blazePulseCacheParserE5J9MIXejCUzYpvDP1920396448114902.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = blueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859;
        return blazePulseCacheParserE5J9MIXejCUzYpvDP1920396448114902;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        UltraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250 != null) {
            ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495("setCurrentState");
            ultraBufferStateStorageNHdrfmdKXE6fVf1YnD90269720334250.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(BlazePulseSerializationPipelineVD0AAtyx4o44r1lN5i33554010509704.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
        }
        super.onSaveInstanceState(bundle);
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ArcticByteModuleSyntaxK9b7A5f5fcCBc60KKj74442121357334) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867()) {
                ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            JadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647 jadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647 = (JadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647) this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.getValue();
            synchronized (jadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                try {
                    jadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = true;
                    ArrayList arrayList = jadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    }
                    jadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598) {
            return;
        }
        Iterator it = this.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ArcticByteModuleSyntaxK9b7A5f5fcCBc60KKj74442121357334) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new GoldenVectorBinaryOperatorB6C2SkXn1ZjlUzoopV69053203471163(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195) {
            return;
        }
        Iterator it = this.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ArcticByteModuleSyntaxK9b7A5f5fcCBc60KKj74442121357334) it.next()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new ObsidianEngineVectorStreamMdwnkTX0BC4QJnM0C984284538751478(z));
        }
    }
}
