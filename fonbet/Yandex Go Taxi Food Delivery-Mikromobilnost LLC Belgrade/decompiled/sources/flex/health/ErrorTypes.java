package flex.health;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\bJ\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bK¨\u0006L"}, d2 = {"Lflex/health/ErrorTypes;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UNSUPPORTED_SECTION", "CORRUPTED_SECTION", "SECTIONS_OPERATION_FAILED", "UNSUPPORTED_CONTENT", "CORRUPTED_CONTENT", "UNSUPPORTED_ACTION", "CORRUPTED_ACTION", "ACTION_HANDLER_NOT_FOUND", "TEMPLATED_ACTION_EXECUTION_FAILED", "REFERENCE_ACTION_EXECUTION_FAILED", "VIVALDI_FLEX_ACTION_EXECUTION_FAILED", "UNABLE_TO_DISPATCH_ON_PARENT_ENGINE", "DEFERRED_DECODED_ACTION_EXECUTION_FAILED", "DEFERRED_DECODING_ACTION_EXECUTION_FAILED", "UNKNOWN_NAVIGATION_ACTION", "UNSUPPORTED_SCAFFOLD", "CORRUPTED_SCAFFOLD", "UNSUPPORTED_ANIMATION", "CORRUPTED_ANIMATION", "ANIMATION_HANDLER_NOT_FOUND", "ACTION_SERVICE_REQUEST_ERROR", "ACTION_SERVICE_PARSE_ERROR", "DOCUMENT_REQUEST_ERROR", "DOCUMENT_PARSE_ERROR", "DOCUMENT_CONTENT_ERROR", "SKELETON_PARSE_ERROR", "COMMAND_NOT_HANDLED", "DETAILS_EXTRACTOR_ERROR", "DIVKIT_TEMPLATE_DECODING_ERROR", "DIVKIT_VARIABLES_DECODING_WARNING", "DIVKIT_VARIABLES_DECODING_ERROR", "DIVKIT_DIVDATA_DECODING_WARNING", "DIVKIT_DIVDATA_DECODING_ERROR", "DIVKIT_DIVDATA_DECODING_EMPTY", "DIVKIT_SHARED_DIVDATA_DECODING_ERROR", "DIVKIT_VIEW_CONTAINER_ERROR", "DIVKIT_UNSUPPORTED_BINDING_METHOD", "DIVKIT_CORRUPTED_BINDING_METHOD", "DIVKIT_BINDING_COORDINATION_ERROR", "DIVKIT_TAB_BAR_UNSUPPORTED_TAB", "DIVKIT_TAB_BAR_CORRUPTED_TAB", "DIVKIT_TAB_BAR_NO_TABS", "DIVKIT_TAB_BAR_FAILED_SELECT_TAB", "DIVKIT_TAB_BAR_DISPATCH_ON_TAB_FAILED", "DIVKIT_SCAFFOLD_UPDATE_FAILED", "JS_SCENARIO_MISSING_EFFECT", "JS_SCENARIO_UNEXPECTED_EVENT", "JS_SCENARIO_FETCH_FAILED", "JS_SCENARIO_SAVE_FAILED", "JS_SCENARIO_TRIGGER_CONDITION_FAILED", "JS_SCENARIO_TRIGGER_NONBOOLEAN_RESULT", "JS_STATE_STORE_OBSERVER_NOTIFY_FAILED", "JS_UPDATE_NON_MAIN_THREAD", "CACHE_DEFAULT_GETTING_FAILED", "CACHE_METADATA_VALIDATION_FAILED", "CACHE_IN_MEMORY_SAVE_FAILED", "CACHE_DISK_SAVE_FAILED", "CACHE_DISK_CLEAR_FAILED", "ASYNC_CACHE_FAILED", "INVALIDATE_CACHE_FAILED", "PRELOAD_ERROR", "PREFETCH_DOCUMENT_ACTION_EXECUTION_FAILED", "REMOTE_TRACKER_DECODING_FAILED", "REMOTE_TRACKER_UNSUPPORTED", "UNSUPPORTED_TAB_STATE", "UNSUPPORTED_TAB", "DOCUMENT_ENGINE_SAVE_STATE_FAILED", "DOCUMENT_ENGINE_RESTORE_STATE_FAILED", "TEMPLATED_SECTION_ERROR", "flex-health"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ErrorTypes {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorTypes[] $VALUES;
    public static final ErrorTypes ACTION_HANDLER_NOT_FOUND;
    public static final ErrorTypes ACTION_SERVICE_PARSE_ERROR;
    public static final ErrorTypes ACTION_SERVICE_REQUEST_ERROR;
    public static final ErrorTypes ANIMATION_HANDLER_NOT_FOUND;
    public static final ErrorTypes ASYNC_CACHE_FAILED;
    public static final ErrorTypes CACHE_DEFAULT_GETTING_FAILED;
    public static final ErrorTypes CACHE_DISK_CLEAR_FAILED;
    public static final ErrorTypes CACHE_DISK_SAVE_FAILED;
    public static final ErrorTypes CACHE_IN_MEMORY_SAVE_FAILED;
    public static final ErrorTypes CACHE_METADATA_VALIDATION_FAILED;
    public static final ErrorTypes COMMAND_NOT_HANDLED;
    public static final ErrorTypes CORRUPTED_ACTION;
    public static final ErrorTypes CORRUPTED_ANIMATION;
    public static final ErrorTypes CORRUPTED_CONTENT;
    public static final ErrorTypes CORRUPTED_SCAFFOLD;
    public static final ErrorTypes CORRUPTED_SECTION;
    public static final ErrorTypes DEFERRED_DECODED_ACTION_EXECUTION_FAILED;
    public static final ErrorTypes DEFERRED_DECODING_ACTION_EXECUTION_FAILED;
    public static final ErrorTypes DETAILS_EXTRACTOR_ERROR;
    public static final ErrorTypes DIVKIT_BINDING_COORDINATION_ERROR;
    public static final ErrorTypes DIVKIT_CORRUPTED_BINDING_METHOD;
    public static final ErrorTypes DIVKIT_DIVDATA_DECODING_EMPTY;
    public static final ErrorTypes DIVKIT_DIVDATA_DECODING_ERROR;
    public static final ErrorTypes DIVKIT_DIVDATA_DECODING_WARNING;
    public static final ErrorTypes DIVKIT_SCAFFOLD_UPDATE_FAILED;
    public static final ErrorTypes DIVKIT_SHARED_DIVDATA_DECODING_ERROR;
    public static final ErrorTypes DIVKIT_TAB_BAR_CORRUPTED_TAB;
    public static final ErrorTypes DIVKIT_TAB_BAR_DISPATCH_ON_TAB_FAILED;
    public static final ErrorTypes DIVKIT_TAB_BAR_FAILED_SELECT_TAB;
    public static final ErrorTypes DIVKIT_TAB_BAR_NO_TABS;
    public static final ErrorTypes DIVKIT_TAB_BAR_UNSUPPORTED_TAB;
    public static final ErrorTypes DIVKIT_TEMPLATE_DECODING_ERROR;
    public static final ErrorTypes DIVKIT_UNSUPPORTED_BINDING_METHOD;
    public static final ErrorTypes DIVKIT_VARIABLES_DECODING_ERROR;
    public static final ErrorTypes DIVKIT_VARIABLES_DECODING_WARNING;
    public static final ErrorTypes DIVKIT_VIEW_CONTAINER_ERROR;
    public static final ErrorTypes DOCUMENT_CONTENT_ERROR;
    public static final ErrorTypes DOCUMENT_ENGINE_RESTORE_STATE_FAILED;
    public static final ErrorTypes DOCUMENT_ENGINE_SAVE_STATE_FAILED;
    public static final ErrorTypes DOCUMENT_PARSE_ERROR;
    public static final ErrorTypes DOCUMENT_REQUEST_ERROR;
    public static final ErrorTypes INVALIDATE_CACHE_FAILED;
    public static final ErrorTypes JS_SCENARIO_FETCH_FAILED;
    public static final ErrorTypes JS_SCENARIO_MISSING_EFFECT;
    public static final ErrorTypes JS_SCENARIO_SAVE_FAILED;
    public static final ErrorTypes JS_SCENARIO_TRIGGER_CONDITION_FAILED;
    public static final ErrorTypes JS_SCENARIO_TRIGGER_NONBOOLEAN_RESULT;
    public static final ErrorTypes JS_SCENARIO_UNEXPECTED_EVENT;
    public static final ErrorTypes JS_STATE_STORE_OBSERVER_NOTIFY_FAILED;
    public static final ErrorTypes JS_UPDATE_NON_MAIN_THREAD;
    public static final ErrorTypes PREFETCH_DOCUMENT_ACTION_EXECUTION_FAILED;
    public static final ErrorTypes PRELOAD_ERROR;
    public static final ErrorTypes REFERENCE_ACTION_EXECUTION_FAILED;
    public static final ErrorTypes REMOTE_TRACKER_DECODING_FAILED;
    public static final ErrorTypes REMOTE_TRACKER_UNSUPPORTED;
    public static final ErrorTypes SECTIONS_OPERATION_FAILED;
    public static final ErrorTypes SKELETON_PARSE_ERROR;
    public static final ErrorTypes TEMPLATED_ACTION_EXECUTION_FAILED;
    public static final ErrorTypes TEMPLATED_SECTION_ERROR;
    public static final ErrorTypes UNABLE_TO_DISPATCH_ON_PARENT_ENGINE;
    public static final ErrorTypes UNKNOWN_NAVIGATION_ACTION;
    public static final ErrorTypes UNSUPPORTED_ACTION;
    public static final ErrorTypes UNSUPPORTED_ANIMATION;
    public static final ErrorTypes UNSUPPORTED_CONTENT;
    public static final ErrorTypes UNSUPPORTED_SCAFFOLD;
    public static final ErrorTypes UNSUPPORTED_SECTION;
    public static final ErrorTypes UNSUPPORTED_TAB;
    public static final ErrorTypes UNSUPPORTED_TAB_STATE;
    public static final ErrorTypes VIVALDI_FLEX_ACTION_EXECUTION_FAILED;
    private final String type;

    static {
        ErrorTypes errorTypes = new ErrorTypes("UNSUPPORTED_SECTION", 0, "Section.Decoding.Unsupported");
        UNSUPPORTED_SECTION = errorTypes;
        ErrorTypes errorTypes2 = new ErrorTypes("CORRUPTED_SECTION", 1, "Section.Decoding.Corrupted");
        CORRUPTED_SECTION = errorTypes2;
        ErrorTypes errorTypes3 = new ErrorTypes("SECTIONS_OPERATION_FAILED", 2, "Sections.Operation.Failed");
        SECTIONS_OPERATION_FAILED = errorTypes3;
        ErrorTypes errorTypes4 = new ErrorTypes("UNSUPPORTED_CONTENT", 3, "Content.Decoding.Unsupported");
        UNSUPPORTED_CONTENT = errorTypes4;
        ErrorTypes errorTypes5 = new ErrorTypes("CORRUPTED_CONTENT", 4, "Content.Decoding.Corrupted");
        CORRUPTED_CONTENT = errorTypes5;
        ErrorTypes errorTypes6 = new ErrorTypes("UNSUPPORTED_ACTION", 5, "Action.Decoding.Unsupported");
        UNSUPPORTED_ACTION = errorTypes6;
        ErrorTypes errorTypes7 = new ErrorTypes("CORRUPTED_ACTION", 6, "Action.Decoding.Corrupted");
        CORRUPTED_ACTION = errorTypes7;
        ErrorTypes errorTypes8 = new ErrorTypes("ACTION_HANDLER_NOT_FOUND", 7, "ActionDispatcher.Action.Execution.Failed");
        ACTION_HANDLER_NOT_FOUND = errorTypes8;
        ErrorTypes errorTypes9 = new ErrorTypes("TEMPLATED_ACTION_EXECUTION_FAILED", 8, "TemplatedActionHandler.Execution.Failed");
        TEMPLATED_ACTION_EXECUTION_FAILED = errorTypes9;
        ErrorTypes errorTypes10 = new ErrorTypes("REFERENCE_ACTION_EXECUTION_FAILED", 9, "ReferenceActionHandler.Execution.Failed");
        REFERENCE_ACTION_EXECUTION_FAILED = errorTypes10;
        ErrorTypes errorTypes11 = new ErrorTypes("VIVALDI_FLEX_ACTION_EXECUTION_FAILED", 10, "FlexVivaldiActionHandler.Execution.Failed");
        VIVALDI_FLEX_ACTION_EXECUTION_FAILED = errorTypes11;
        ErrorTypes errorTypes12 = new ErrorTypes("UNABLE_TO_DISPATCH_ON_PARENT_ENGINE", 11, "Engine.ParentEngine.Dispatching.Failed");
        UNABLE_TO_DISPATCH_ON_PARENT_ENGINE = errorTypes12;
        ErrorTypes errorTypes13 = new ErrorTypes("DEFERRED_DECODED_ACTION_EXECUTION_FAILED", 12, "DeferredDecodedActionHandler.Execution.Failed");
        DEFERRED_DECODED_ACTION_EXECUTION_FAILED = errorTypes13;
        ErrorTypes errorTypes14 = new ErrorTypes("DEFERRED_DECODING_ACTION_EXECUTION_FAILED", 13, "DeferredDecodingActionHandler.Execution.Failed");
        DEFERRED_DECODING_ACTION_EXECUTION_FAILED = errorTypes14;
        ErrorTypes errorTypes15 = new ErrorTypes("UNKNOWN_NAVIGATION_ACTION", 14, "Action.Navigation.Unknown");
        UNKNOWN_NAVIGATION_ACTION = errorTypes15;
        ErrorTypes errorTypes16 = new ErrorTypes("UNSUPPORTED_SCAFFOLD", 15, "Scaffold.Decoding.Unsupported");
        UNSUPPORTED_SCAFFOLD = errorTypes16;
        ErrorTypes errorTypes17 = new ErrorTypes("CORRUPTED_SCAFFOLD", 16, "Scaffold.Decoding.Corrupted");
        CORRUPTED_SCAFFOLD = errorTypes17;
        ErrorTypes errorTypes18 = new ErrorTypes("UNSUPPORTED_ANIMATION", 17, "Animation.Decoding.Unsupported");
        UNSUPPORTED_ANIMATION = errorTypes18;
        ErrorTypes errorTypes19 = new ErrorTypes("CORRUPTED_ANIMATION", 18, "Animation.Decoding.Corrupted");
        CORRUPTED_ANIMATION = errorTypes19;
        ErrorTypes errorTypes20 = new ErrorTypes("ANIMATION_HANDLER_NOT_FOUND", 19, "AnimationPlayer.Animation.Handler.Unsupported");
        ANIMATION_HANDLER_NOT_FOUND = errorTypes20;
        ErrorTypes errorTypes21 = new ErrorTypes("ACTION_SERVICE_REQUEST_ERROR", 20, "ActionService.RequestError");
        ACTION_SERVICE_REQUEST_ERROR = errorTypes21;
        ErrorTypes errorTypes22 = new ErrorTypes("ACTION_SERVICE_PARSE_ERROR", 21, "ActionService.DecodingError");
        ACTION_SERVICE_PARSE_ERROR = errorTypes22;
        ErrorTypes errorTypes23 = new ErrorTypes("DOCUMENT_REQUEST_ERROR", 22, "Document.Request.Failed");
        DOCUMENT_REQUEST_ERROR = errorTypes23;
        ErrorTypes errorTypes24 = new ErrorTypes("DOCUMENT_PARSE_ERROR", 23, "Document.Decoding.Failed");
        DOCUMENT_PARSE_ERROR = errorTypes24;
        ErrorTypes errorTypes25 = new ErrorTypes("DOCUMENT_CONTENT_ERROR", 24, "Document.Content.Failed");
        DOCUMENT_CONTENT_ERROR = errorTypes25;
        ErrorTypes errorTypes26 = new ErrorTypes("SKELETON_PARSE_ERROR", 25, "Skeleton.Decoding.Failed");
        SKELETON_PARSE_ERROR = errorTypes26;
        ErrorTypes errorTypes27 = new ErrorTypes("COMMAND_NOT_HANDLED", 26, "Command.Publish.Failed");
        COMMAND_NOT_HANDLED = errorTypes27;
        ErrorTypes errorTypes28 = new ErrorTypes("DETAILS_EXTRACTOR_ERROR", 27, "DetailsExtract.Failed");
        DETAILS_EXTRACTOR_ERROR = errorTypes28;
        ErrorTypes errorTypes29 = new ErrorTypes("DIVKIT_TEMPLATE_DECODING_ERROR", 28, "Divkit.Template.Decoding.Error");
        DIVKIT_TEMPLATE_DECODING_ERROR = errorTypes29;
        ErrorTypes errorTypes30 = new ErrorTypes("DIVKIT_VARIABLES_DECODING_WARNING", 29, "Divkit.Variables.Decoding.Warning");
        DIVKIT_VARIABLES_DECODING_WARNING = errorTypes30;
        ErrorTypes errorTypes31 = new ErrorTypes("DIVKIT_VARIABLES_DECODING_ERROR", 30, "Divkit.Variables.Decoding.Error");
        DIVKIT_VARIABLES_DECODING_ERROR = errorTypes31;
        ErrorTypes errorTypes32 = new ErrorTypes("DIVKIT_DIVDATA_DECODING_WARNING", 31, "Divkit.DivData.Decoding.Warning");
        DIVKIT_DIVDATA_DECODING_WARNING = errorTypes32;
        ErrorTypes errorTypes33 = new ErrorTypes("DIVKIT_DIVDATA_DECODING_ERROR", 32, "Divkit.DivData.Decoding.Error");
        DIVKIT_DIVDATA_DECODING_ERROR = errorTypes33;
        ErrorTypes errorTypes34 = new ErrorTypes("DIVKIT_DIVDATA_DECODING_EMPTY", 33, "Divkit.DivData.Decoding.Empty");
        DIVKIT_DIVDATA_DECODING_EMPTY = errorTypes34;
        ErrorTypes errorTypes35 = new ErrorTypes("DIVKIT_SHARED_DIVDATA_DECODING_ERROR", 34, "Divkit.SharedDivData.Decoding.Error");
        DIVKIT_SHARED_DIVDATA_DECODING_ERROR = errorTypes35;
        ErrorTypes errorTypes36 = new ErrorTypes("DIVKIT_VIEW_CONTAINER_ERROR", 35, "Divkit.DivViewContainer.Error");
        DIVKIT_VIEW_CONTAINER_ERROR = errorTypes36;
        ErrorTypes errorTypes37 = new ErrorTypes("DIVKIT_UNSUPPORTED_BINDING_METHOD", 36, "Divkit.BinbingMethod.Unsupported");
        DIVKIT_UNSUPPORTED_BINDING_METHOD = errorTypes37;
        ErrorTypes errorTypes38 = new ErrorTypes("DIVKIT_CORRUPTED_BINDING_METHOD", 37, "Divkit.BinbingMethod.Corrupted");
        DIVKIT_CORRUPTED_BINDING_METHOD = errorTypes38;
        ErrorTypes errorTypes39 = new ErrorTypes("DIVKIT_BINDING_COORDINATION_ERROR", 38, "Divkit.BindingCoordination.Error");
        DIVKIT_BINDING_COORDINATION_ERROR = errorTypes39;
        ErrorTypes errorTypes40 = new ErrorTypes("DIVKIT_TAB_BAR_UNSUPPORTED_TAB", 39, "TabBar.Tab.Decoding.Unsupported");
        DIVKIT_TAB_BAR_UNSUPPORTED_TAB = errorTypes40;
        ErrorTypes errorTypes41 = new ErrorTypes("DIVKIT_TAB_BAR_CORRUPTED_TAB", 40, "TabBar.Tab.Decoding.Corrupted");
        DIVKIT_TAB_BAR_CORRUPTED_TAB = errorTypes41;
        ErrorTypes errorTypes42 = new ErrorTypes("DIVKIT_TAB_BAR_NO_TABS", 41, "TabBar.Tabs.Is.Empty");
        DIVKIT_TAB_BAR_NO_TABS = errorTypes42;
        ErrorTypes errorTypes43 = new ErrorTypes("DIVKIT_TAB_BAR_FAILED_SELECT_TAB", 42, "TabBar.Tab.Select.Failed");
        DIVKIT_TAB_BAR_FAILED_SELECT_TAB = errorTypes43;
        ErrorTypes errorTypes44 = new ErrorTypes("DIVKIT_TAB_BAR_DISPATCH_ON_TAB_FAILED", 43, "TabBar.DispatchOn.Tab.Failed");
        DIVKIT_TAB_BAR_DISPATCH_ON_TAB_FAILED = errorTypes44;
        ErrorTypes errorTypes45 = new ErrorTypes("DIVKIT_SCAFFOLD_UPDATE_FAILED", 44, "DivkitScaffold.Update.Failed");
        DIVKIT_SCAFFOLD_UPDATE_FAILED = errorTypes45;
        ErrorTypes errorTypes46 = new ErrorTypes("JS_SCENARIO_MISSING_EFFECT", 45, "JasonStatham.Integration.Scenario.Effect.Missing");
        JS_SCENARIO_MISSING_EFFECT = errorTypes46;
        ErrorTypes errorTypes47 = new ErrorTypes("JS_SCENARIO_UNEXPECTED_EVENT", 46, "JasonStatham.Integration.Scenario.Event.Unexpected");
        JS_SCENARIO_UNEXPECTED_EVENT = errorTypes47;
        ErrorTypes errorTypes48 = new ErrorTypes("JS_SCENARIO_FETCH_FAILED", 47, "JasonStatham.Integration.DiskStorage.FetchState.Failed");
        JS_SCENARIO_FETCH_FAILED = errorTypes48;
        ErrorTypes errorTypes49 = new ErrorTypes("JS_SCENARIO_SAVE_FAILED", 48, "JasonStatham.Integration.DiskStorage.SaveState.Failed");
        JS_SCENARIO_SAVE_FAILED = errorTypes49;
        ErrorTypes errorTypes50 = new ErrorTypes("JS_SCENARIO_TRIGGER_CONDITION_FAILED", 49, "JasonStatham.Integration.TriggerLauncher.Condition.Check.Failed");
        JS_SCENARIO_TRIGGER_CONDITION_FAILED = errorTypes50;
        ErrorTypes errorTypes51 = new ErrorTypes("JS_SCENARIO_TRIGGER_NONBOOLEAN_RESULT", 50, "JasonStatham.Integration.TriggerLauncher.NonBoolean.Result");
        JS_SCENARIO_TRIGGER_NONBOOLEAN_RESULT = errorTypes51;
        ErrorTypes errorTypes52 = new ErrorTypes("JS_STATE_STORE_OBSERVER_NOTIFY_FAILED", 51, "JasonStatham.Integration.JasonStateStore.Observer.Notification.Failed");
        JS_STATE_STORE_OBSERVER_NOTIFY_FAILED = errorTypes52;
        ErrorTypes errorTypes53 = new ErrorTypes("JS_UPDATE_NON_MAIN_THREAD", 52, "JasonStatham.Integration.Running.From.Background.Thread");
        JS_UPDATE_NON_MAIN_THREAD = errorTypes53;
        ErrorTypes errorTypes54 = new ErrorTypes("CACHE_DEFAULT_GETTING_FAILED", 53, "DefaultCaching.Resource.Getting.Failed");
        CACHE_DEFAULT_GETTING_FAILED = errorTypes54;
        ErrorTypes errorTypes55 = new ErrorTypes("CACHE_METADATA_VALIDATION_FAILED", 54, "DefaultCaching.MetaData.Validation.Failed");
        CACHE_METADATA_VALIDATION_FAILED = errorTypes55;
        ErrorTypes errorTypes56 = new ErrorTypes("CACHE_IN_MEMORY_SAVE_FAILED", 55, "InMemory.Save.Failed");
        CACHE_IN_MEMORY_SAVE_FAILED = errorTypes56;
        ErrorTypes errorTypes57 = new ErrorTypes("CACHE_DISK_SAVE_FAILED", 56, "DiskCaching.Save.Failed");
        CACHE_DISK_SAVE_FAILED = errorTypes57;
        ErrorTypes errorTypes58 = new ErrorTypes("CACHE_DISK_CLEAR_FAILED", 57, "DiskCaching.ClearAllFiles.Failed");
        CACHE_DISK_CLEAR_FAILED = errorTypes58;
        ErrorTypes errorTypes59 = new ErrorTypes("ASYNC_CACHE_FAILED", 58, "AsyncCaching.Save.Failed");
        ASYNC_CACHE_FAILED = errorTypes59;
        ErrorTypes errorTypes60 = new ErrorTypes("INVALIDATE_CACHE_FAILED", 59, "InvalidateCacheAction.Delete.Failed");
        INVALIDATE_CACHE_FAILED = errorTypes60;
        ErrorTypes errorTypes61 = new ErrorTypes("PRELOAD_ERROR", 60, "PreloadAction.Handle.Failed");
        PRELOAD_ERROR = errorTypes61;
        ErrorTypes errorTypes62 = new ErrorTypes("PREFETCH_DOCUMENT_ACTION_EXECUTION_FAILED", 61, "PrefetchDocumentActionHandler.Execution.Failed");
        PREFETCH_DOCUMENT_ACTION_EXECUTION_FAILED = errorTypes62;
        ErrorTypes errorTypes63 = new ErrorTypes("REMOTE_TRACKER_DECODING_FAILED", 62, "Document.RemoteTracker.Decoding.Failed");
        REMOTE_TRACKER_DECODING_FAILED = errorTypes63;
        ErrorTypes errorTypes64 = new ErrorTypes("REMOTE_TRACKER_UNSUPPORTED", 63, "Document.RemoteTracker.Decoding.Unsupported");
        REMOTE_TRACKER_UNSUPPORTED = errorTypes64;
        ErrorTypes errorTypes65 = new ErrorTypes("UNSUPPORTED_TAB_STATE", 64, "Divkit.Tab.Bar.TabState.Unsupported");
        UNSUPPORTED_TAB_STATE = errorTypes65;
        ErrorTypes errorTypes66 = new ErrorTypes("UNSUPPORTED_TAB", 65, "Divkit.Tab.Bar.Tab.Unsupported");
        UNSUPPORTED_TAB = errorTypes66;
        ErrorTypes errorTypes67 = new ErrorTypes("DOCUMENT_ENGINE_SAVE_STATE_FAILED", 66, "DocumentEngine.SaveState.Failed");
        DOCUMENT_ENGINE_SAVE_STATE_FAILED = errorTypes67;
        ErrorTypes errorTypes68 = new ErrorTypes("DOCUMENT_ENGINE_RESTORE_STATE_FAILED", 67, "DocumentEngine.RestoreState.Failed");
        DOCUMENT_ENGINE_RESTORE_STATE_FAILED = errorTypes68;
        ErrorTypes errorTypes69 = new ErrorTypes("TEMPLATED_SECTION_ERROR", 68, "TemplatedSection.Handle.Failed");
        TEMPLATED_SECTION_ERROR = errorTypes69;
        ErrorTypes[] errorTypesArr = {errorTypes, errorTypes2, errorTypes3, errorTypes4, errorTypes5, errorTypes6, errorTypes7, errorTypes8, errorTypes9, errorTypes10, errorTypes11, errorTypes12, errorTypes13, errorTypes14, errorTypes15, errorTypes16, errorTypes17, errorTypes18, errorTypes19, errorTypes20, errorTypes21, errorTypes22, errorTypes23, errorTypes24, errorTypes25, errorTypes26, errorTypes27, errorTypes28, errorTypes29, errorTypes30, errorTypes31, errorTypes32, errorTypes33, errorTypes34, errorTypes35, errorTypes36, errorTypes37, errorTypes38, errorTypes39, errorTypes40, errorTypes41, errorTypes42, errorTypes43, errorTypes44, errorTypes45, errorTypes46, errorTypes47, errorTypes48, errorTypes49, errorTypes50, errorTypes51, errorTypes52, errorTypes53, errorTypes54, errorTypes55, errorTypes56, errorTypes57, errorTypes58, errorTypes59, errorTypes60, errorTypes61, errorTypes62, errorTypes63, errorTypes64, errorTypes65, errorTypes66, errorTypes67, errorTypes68, errorTypes69};
        $VALUES = errorTypesArr;
        $ENTRIES = a.a(errorTypesArr);
    }

    public ErrorTypes(String str, int i, String str2) {
        this.type = str2;
    }

    public static ErrorTypes valueOf(String str) {
        return (ErrorTypes) Enum.valueOf(ErrorTypes.class, str);
    }

    public static ErrorTypes[] values() {
        return (ErrorTypes[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
